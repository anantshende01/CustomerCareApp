package com.ibm.entity;

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
	
	private Department department;
	
	public Operator() {
		// TODO Auto-generated constructor stub
	}

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Operator(int operatorId, String operatorFirstName, String operatorLastName, String operatorEmail,
			String operatorMobile, String operatorCity, Department department) {
		super();
		this.operatorId = operatorId;
		this.operatorFirstName = operatorFirstName;
		this.operatorLastName = operatorLastName;
		this.operatorEmail = operatorEmail;
		this.operatorMobile = operatorMobile;
		this.operatorCity = operatorCity;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Operator [operatorId=" + operatorId + ", operatorFirstName=" + operatorFirstName + ", operatorLastName="
				+ operatorLastName + ", operatorEmail=" + operatorEmail + ", operatorMobile=" + operatorMobile
				+ ", operatorCity=" + operatorCity + ", department=" + department + "]";
	}
	
	
	
}
