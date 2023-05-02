package com.ibm.customerCare.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "issue")
public class Issue {
	
	@Id
	@Column(name = "id")
	private String issueId;
	
	@Column(name = "type")
	private String issueType;
	
	@Column(name = "description")
	private String issueDescription;
	
	@Column(name = "status")
	private String issueStatus;
	
	public Issue() {
		// TODO Auto-generated constructor stub
	}

	public String getIssueId() {
		return issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}

	public String getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}

	public Issue(String issueId, String issueType, String issueDescription, String issueStatus) {
		super();
		this.issueId = issueId;
		this.issueType = issueType;
		this.issueDescription = issueDescription;
		this.issueStatus = issueStatus;
	}

	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", issueType=" + issueType + ", issueDescription=" + issueDescription
				+ ", issueStatus=" + issueStatus + "]";
	}
	
	
}
