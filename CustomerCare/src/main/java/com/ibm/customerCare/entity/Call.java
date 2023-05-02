package com.ibm.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "call")
public class Call {
	
	@Id
	@Column(name = "id")
	private int callId;
	
	@Column(name = "date")
	private Date callDate;
	
	@Column(name = "duration")
	private double callDuration;
	
	@Column(name = "phonenumber")
	private String phoneNumber;
	
	
	private Customer customer;
	private Operator recievedBy;
	private Issue issue;
	
	public Call() {
		// TODO Auto-generated constructor stub
	}

	public int getCallId() {
		return callId;
	}

	public void setCallId(int callId) {
		this.callId = callId;
	}

	public Date getCallDate() {
		return callDate;
	}

	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}

	public double getCallDuration() {
		return callDuration;
	}

	public void setCallDuration(double callDuration) {
		this.callDuration = callDuration;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Operator getRecievedBy() {
		return recievedBy;
	}

	public void setRecievedBy(Operator recievedBy) {
		this.recievedBy = recievedBy;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public Call(int callId, Date callDate, double callDuration, String phoneNumber, Customer customer,
			Operator recievedBy, Issue issue) {
		super();
		this.callId = callId;
		this.callDate = callDate;
		this.callDuration = callDuration;
		this.phoneNumber = phoneNumber;
		this.customer = customer;
		this.recievedBy = recievedBy;
		this.issue = issue;
	}

	@Override
	public String toString() {
		return "Call [callId=" + callId + ", callDate=" + callDate + ", callDuration=" + callDuration + ", phoneNumber="
				+ phoneNumber + ", customer=" + customer + ", recievedBy=" + recievedBy + ", issue=" + issue + "]";
	}
	
	
}
