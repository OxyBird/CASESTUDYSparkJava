package com.sparkTutorial.sparkSql;

import static org.apache.spark.sql.functions.avg;
import org.apache.hadoop.fs.Hdfs;
import static org.apache.spark.sql.functions.max;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.PairFunction;
import org.apache.spark.sql.DataFrameReader;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.RelationalGroupedDataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import com.sparkTutorial.rdd.commons.Utils;

import scala.Tuple2;

public class CaseStudyBranch {

	public static void main(String[] args) {
		
		
		Logger.getLogger("org").setLevel(Level.ERROR);
        SparkConf conf = new SparkConf().setAppName("CaseStudyBranch").setMaster("local[1]");
        JavaSparkContext sc = new JavaSparkContext(conf);
        
        SparkSession session = SparkSession.builder().appName("CaseStudyBranch").master("local[1]").getOrCreate();
           //use our source as a text file

         JavaRDD<String> externalData = sc.textFile("hdfs://192.168.23.128:8020//user/maria_dev/Folder_for_file_temp/branch_ex/part-m-00000");
         JavaPairRDD<String,Integer> StateOnePair = externalData.mapToPair(line -> new Tuple2<>(line.split("\t")[4],1));
         JavaPairRDD<String, Integer> StateToCountPairs = StateOnePair.reduceByKey((x, y) -> x + y);
 
        
         Integer iMaxValue=0;
         for (Tuple2<String, Integer> countToState : StateToCountPairs.collect()) {
      	   if(countToState._2() > iMaxValue) 	   iMaxValue = countToState._2();   } 
  
        final Integer kMaxValue = iMaxValue;
        JavaPairRDD<String, Integer> sortedStateToCountMAX = StateToCountPairs.filter(keyValue -> keyValue._2().equals(kMaxValue));
        
         
        for (Tuple2<String, Integer> countToState : sortedStateToCountMAX.collect()) {
    	System.out.println(countToState._1() + " : " + countToState._2()); }   
    
        sortedStateToCountMAX.saveAsTextFile("hdfs://192.168.23.128:8020/user/maria_dev/Credit_Card_Number/BranchMax");
 

	}
                 
                   
}
