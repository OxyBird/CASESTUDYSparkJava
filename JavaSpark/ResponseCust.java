package com.sparkTutorial.sparkSql;
import java.io.Serializable;

public class ResponseCust {
	private String SSN;
	private String First_Name;
	private String Middle_Name;
	private String Last_Name;
	private String CC_NO;
	private String Cust_Street;
	private String Cust_City;
	private String Cust_State;
	private String Cust_Country;
	private String Cust_ZIP;
	private String Cust_PHONE;
	private String Cust_email;
	private String cust_last_update;
	
	 public ResponseCust(String SSN, String First_Name, String Middle_Name, String Last_Name,  String CC_NO,
		String Cust_Street, String Cust_City, String Cust_State, String Cust_Country, String Cust_ZIP,
		String Cust_PHONE, String Cust_email, String cust_last_update) {
	        this.SSN = SSN;
	        this.First_Name = First_Name;
	        this.Middle_Name = Middle_Name;
	        this.Last_Name = Last_Name;
	        this.CC_NO = CC_NO;
	        this.Cust_Street = Cust_Street;
	        this.Cust_City = Cust_City;
	        this.Cust_State = Cust_State;
	        this.Cust_Country = Cust_Country;
	        this.Cust_ZIP = Cust_ZIP;
	        this.Cust_PHONE = Cust_PHONE;	        
	        this.Cust_email = Cust_email;	        
	        this.cust_last_update = cust_last_update;
	 }
	
	
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getMiddle_Name() {
		return Middle_Name;
	}
	public void setMiddle_Name(String middle_Name) {
		Middle_Name = middle_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getCC_NO() {
		return CC_NO;
	}
	public void setCC_NO(String cC_NO) {
		CC_NO = cC_NO;
	}
	public String getCust_Street() {
		return Cust_Street;
	}
	public void setCust_Street(String cust_Street) {
		Cust_Street = cust_Street;
	}
	public String getCust_City() {
		return Cust_City;
	}
	public void setCust_City(String cust_City) {
		Cust_City = cust_City;
	}
	public String getCust_State() {
		return Cust_State;
	}
	public void setCust_State(String cust_State) {
		Cust_State = cust_State;
	}
	public String getCust_Country() {
		return Cust_Country;
	}
	public void setCust_Country(String cust_Country) {
		Cust_Country = cust_Country;
	}
	public String getCust_ZIP() {
		return Cust_ZIP;
	}
	public void setCust_ZIP(String cust_ZIP) {
		Cust_ZIP = cust_ZIP;
	}
	public String getCust_PHONE() {
		return Cust_PHONE;
	}
	public void setCust_PHONE(String cust_PHONE) {
		Cust_PHONE = cust_PHONE;
	}
	public String getCust_email() {
		return Cust_email;
	}
	public void setCust_email(String cust_email) {
		Cust_email = cust_email;
	}
	public String getCust_last_update() {
		return cust_last_update;
	}
	public void setCust_last_update(String cust_last_update) {
		this.cust_last_update = cust_last_update;
	}
	@Override
	
	public String toString() {
		return "ResponseCust [SSN=" + SSN + '\''+
				", First_Name=" + First_Name + '\''+
				", Middle_Name=" + Middle_Name + '\''+ 
				", Last_Name=" + Last_Name + '\''+
				", CC_NO=" + CC_NO + '\''+
				", Cust_Street=" + Cust_Street + '\''+
				", Cust_City="+ Cust_City + '\''+
				", Cust_State=" + Cust_State + '\''+
				", Cust_Country=" + Cust_Country + '\''+
				", Cust_ZIP=" + Cust_ZIP + '\''+
				", Cust_PHONE=" + Cust_PHONE + '\''+
				", Cust_email=" + Cust_email + '\''+
				", cust_last_update=" + cust_last_update+'\''+
				"]";
		
	}
	
		

}
