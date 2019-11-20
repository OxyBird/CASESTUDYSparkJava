package com.sparkTutorial.sparkSql;

import java.io.Serializable;

public class ResponseB implements Serializable {
	private String Branch_Code;
	private String Branch_Name;
	private String Branch_Street;
	private String Branch_City;
	private String Branch_State;
	private String Branch_ZIP;
	private String Branch_Phone;
	private String branch_last_update;


    public ResponseB(String Branch_Code, String Branch_Name, String Branch_Street, String Branch_City,
    		String Branch_State, String Branch_ZIP, String Branch_Phone,String branch_last_update) {
        this.Branch_Code= Branch_Code;
        this.Branch_Name = Branch_Name;
        this.Branch_Street = Branch_Street;
        this.Branch_City = Branch_City;
        this.Branch_State = Branch_State;
        this.Branch_ZIP = Branch_ZIP;
        this.Branch_Phone = Branch_Phone;
        this.branch_last_update = branch_last_update;                      
    }
    
  public ResponseB() {}

  public String getBranch_Code() {
		return Branch_Code;
	}

  public void setBranch_Code(String branch_Code) {
		Branch_Code = branch_Code;
	}


	public String getBranch_Name() {
		return Branch_Name;
	}


	public void setBranch_Name(String branch_Name) {
		Branch_Name = branch_Name;
	}


	public String getBranch_Street() {
		return Branch_Street;
	}


	public void setBranch_Street(String branch_Street) {
		Branch_Street = branch_Street;
	}


	public String getBranch_City() {
		return Branch_City;
	}


	public void setBranch_City(String branch_City) {
		Branch_City = branch_City;
	}


	public String getBranch_State() {
		return Branch_State;
	}


	public void setBranch_State(String branch_State) {
		Branch_State = branch_State;
	}


	public String getBranch_ZIP() {
		return Branch_ZIP;
	}


	public void setBranch_ZIP(String branch_ZIP) {
		Branch_ZIP = branch_ZIP;
	}


	public String getBranch_Phone() {
		return Branch_Phone;
	}


	public void setBranch_Phone(String branch_Phone) {
		Branch_Phone = branch_Phone;
	}


	public String getBranch_last_update() {
		return branch_last_update;
	}


	public void setBranch_last_update(String branch_last_update) {
		this.branch_last_update = branch_last_update;
	}

	@Override
	
	public String toString() {
		return "ResponseB [Branch_Code=" + Branch_Code + '\'' + 
				", Branch_Name=" + Branch_Name + '\'' + 
				", Branch_Street="+ Branch_Street + '\'' + 
				", Branch_City=" + Branch_City + '\'' + 
				", Branch_State=" + Branch_State + '\'' + 
				", Branch_ZIP="	+ Branch_ZIP + + '\''+
				", Branch_Phone=" + Branch_Phone + '\''+
				", branch_last_update=" + branch_last_update + '\'' + "]";
	}

	
	}

}
