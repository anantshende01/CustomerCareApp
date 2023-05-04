package com.ibm.customerCare.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "operator")
public class Operator {
	
	@Id
	@Column(name = "id")
	private int operatorId;
	
	@Column(name = "password")
	private String operatorpass;

	@Column(name = "firstname")
	private String operatorFirstName;
	
	@Column(name = "lastname")
	private String operatorLastName;
	
	@Column(name = "email")
	private String operatorEmail;
	
	@Column(name = "mobile")
	private String operatorMobile;
	
	@Column(name = "city")
	private String operatorCity;
	
//	private Department department;

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}
	
	public String getOperatorpass() {
		return operatorpass;
	}

	public void setOperatorpass(String operatorpass) {
		this.operatorpass = operatorpass;
	}


	public String getOperatorFirstName() {
		return operatorFirstName;
	}

	public void setOperatorFirstName(String operatorFirstName) {
		this.operatorFirstName = operatorFirstName;
	}

	public String getOperatorLastName() {
		return operatorLastName;
	}

	public void setOperatorLastName(String operatorLastName) {
		this.operatorLastName = operatorLastName;
	}

	public String getOperatorEmail() {
		return operatorEmail;
	}

	public void setOperatorEmail(String operatorEmail) {
		this.operatorEmail = operatorEmail;
	}

	public String getOperatorMobile() {
		return operatorMobile;
	}

	public void setOperatorMobile(String operatorMobile) {
		this.operatorMobile = operatorMobile;
	}

	public String getOperatorCity() {
		return operatorCity;
	}

	public void setOperatorCity(String operatorCity) {
		this.operatorCity = operatorCity;
	}
	

	public Operator(String operatorpass) {
		super();
		this.operatorpass = operatorpass;
	}
	
	
	
	
}
