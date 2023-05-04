package com.ibm.customerCare.service;

import java.util.List;

import com.fasterxml.jackson.databind.node.BooleanNode;
import com.ibm.customerCare.model.Customer;
import com.ibm.customerCare.model.Issue;
import com.ibm.customerCare.model.Login;

public interface OperatorService {
	
	public String login(Login login);
	public String addCustomerIssue(Issue issue);
	public String sendIntimationMailToCustomer(int issueId , int customerId);
	public String modifytomerIssue(Issue issue);
	public String sendModificationMailToCustomer(int issueId , int customerId);
	public String closeCustomerIssue(Issue issue);
	public Customer findCustomerById(int customerId);
	List<Customer> findCustomerByName(String name);
	public String findCustomerByEmail(String email);
	public BooleanNode lookCustomer(int customerId);
	

}
