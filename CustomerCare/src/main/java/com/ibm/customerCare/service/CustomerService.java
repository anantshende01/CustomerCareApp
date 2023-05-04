package com.ibm.customerCare.service;

import java.util.List;


import com.ibm.customerCare.model.Customer;
import com.ibm.customerCare.model.Issue;
import com.ibm.customerCare.model.Login;

public interface CustomerService {
	public String login(Login login);
	public String registerCustomer(Customer customer);
	public Issue viewIssueById(int issueId);
	public Issue reopenIssue(int issueId);
	public List<Issue> viewAllIssues();
	public String changePassword(Login login);
	public String forgotPassword(int customerId, String newPassword);
	public String logout(Login login);
}
