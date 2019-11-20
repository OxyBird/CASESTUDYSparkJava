package com.sparkTutorial.sparkSql;
import java.io.Serializable;

public class ResponseCC {
		
	private String Cust_CC;
	private String TimeID;
	private String Cust_SSN;
	private String Branch_Code;
	private String Trans_Type;
	private String Trans_Value;
	
	 public ResponseCC (String Cust_CC, String TimeID, String Cust_SSN, String Branch_Code,
	    		String Trans_Type, String Trans_Value) {
	        this.Cust_CC= Cust_CC;
	        this.TimeID = TimeID;
	        this.Cust_SSN = Cust_SSN;
	        this.Branch_Code = Branch_Code;
	        this.Trans_Type = Trans_Type;
	        this.Trans_Value = Trans_Value;                    
	    }
	
	public String getCust_CC() {
		return Cust_CC;
	}
	public void setCust_CC(String cust_CC) {
		Cust_CC = cust_CC;
	}
	public String getTimeID() {
		return TimeID;
	}
	public void setTimeID(String timeID) {
		TimeID = timeID;
	}
	public String getCust_SSN() {
		return Cust_SSN;
	}
	public void setCust_SSN(String cust_SSN) {
		Cust_SSN = cust_SSN;
	}
	public String getBranch_Code() {
		return Branch_Code;
	}
	public void setBranch_Code(String branch_Code) {
		Branch_Code = branch_Code;
	}
	public String getTrans_Type() {
		return Trans_Type;
	}
	public void setTrans_Type(String trans_Type) {
		Trans_Type = trans_Type;
	}
	public String getTrans_Value() {
		return Trans_Value;
	}
	public void setTrans_Value(String trans_Value) {
		Trans_Value = trans_Value;
	}
	@Override
	
	public String toString() {
		return "ResponseCC [Cust_CC=" + Cust_CC + '\''+
				", TimeID=" + TimeID + '\''+
				", Cust_SSN=" + Cust_SSN + '\''+
				", Branch_Code=" + Branch_Code + '\''+
				", Trans_Type=" + Trans_Type + '\''+
				", Trans_Value=" + Trans_Value + '\''+
				"]";
	}
	
	
	
	
	
	
	
	

}
