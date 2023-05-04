package com.ibm.customerCare.service;

import java.util.List;

import com.ibm.customerCare.exceptions.CustomerNotFoundException;
import com.ibm.customerCare.exceptions.DuplicateCustomerException;
import com.ibm.customerCare.exceptions.InvalidCredintialException;
import com.ibm.customerCare.model.Customer;
import com.ibm.customerCare.model.Issue;
import com.ibm.customerCare.model.Login;

public interface CustomerService {
	public String login(Login login) throws InvalidCredintialException, CustomerNotFoundException;
	public String registerCustomer(Customer customer) throws DuplicateCustomerException;
	public Issue viewIssueById(int issueId);
	public Issue reopenIssue(int issueId);
	public List<Issue> viewAllIssues();
	public String changePassword(Login login);
	public String forgotPassword(int customerId, String newPassword);
	public String logout(Login login);
}
