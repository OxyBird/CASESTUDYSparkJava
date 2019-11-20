package com.sparkTutorial.sparkSql;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.sql.*;

import static org.apache.spark.sql.functions.avg;
import static org.apache.spark.sql.functions.col;
import static org.apache.spark.sql.functions.max;


public class CaseStudyStateTransactions {

	public static void main(String[] args) {
		
		
		Logger.getLogger("org").setLevel(Level.ERROR);
        SparkConf conf = new SparkConf().setAppName("CaseStudyStateTransactions").setMaster("local[3]");
        JavaSparkContext sc = new JavaSparkContext(conf);
        
        SparkSession session = SparkSession.builder().appName("CaseStudyStateTransactions").master("local[3]").getOrCreate();
           //use our source as a text file
         JavaRDD<String> externalData = sc.textFile("hdfs://192.168.23.128:8020/user/maria_dev/Folder_for_file_temp/CC/part-m-00000");
         JavaRDD<String> externalDataCust = sc.textFile("hdfs://192.168.23.128:8020/user/maria_dev/Folder_for_file_temp/Customer/part-m-00000");
         
         
             JavaRDD<ResponseCC> response = externalData.map(line -> {
        	 String[] split = line.split("	");
        	 return new ResponseCC(split[0], split[1], split[2],split[3], split[4], split[5]);
         });        		 
             JavaRDD<ResponseCust> responseCust = externalDataCust.map(line -> {            	 
            	 String[] split = line.split("	");
            	 return new ResponseCust(split[0], split[1], split[2],split[3], split[4], split[5], split[6], split[7],
            			 split[8], split[9], split[10], split[11], split[12]);
             });        		

Dataset<ResponseCC> CCDataset = session.createDataset(response.rdd(), Encoders.bean(ResponseCC.class));
Dataset<ResponseCust> CustDataset = session.createDataset(responseCust.rdd(), Encoders.bean(ResponseCust.class));
CCDataset.createOrReplaceTempView("CC");
CustDataset.createOrReplaceTempView("CustTable");





Dataset<Row> sqlResult = session.sql("SELECT Cust_State, COUNT(Cust_State) AS Count FROM CustTable "+
"JOIN CC ON CC.CUST_SSN = CustTable.SSN GROUP BY Cust_State  "+
"HAVING COUNT(Cust_State) = "+
"(SELECT MAX(CNT) FROM( "+
"SELECT Cust_State, COUNT(Cust_State) AS CNT FROM CustTable " +
"JOIN CC ON CC.CUST_SSN = CustTable.SSN GROUP BY Cust_State "+
"ORDER BY COUNT(Cust_State) DESC "
+"))");



sqlResult.show();

sqlResult.repartition(1)
.write().format("com.databricks.spark.csv")
.option("header","true")
.save("hdfs://192.168.23.128:8020/user/maria_dev/Credit_Card_Number/StateMaxTransaction");

}

}
