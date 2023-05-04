package com.ibm.customerCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.mail.SimpleMailMessage;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.ibm.customerCare.dao.CustomerDao;
import com.ibm.customerCare.dao.IssueDao;
import com.ibm.customerCare.dao.LoginDao;
import com.ibm.customerCare.dao.OperatorDao;
import com.ibm.customerCare.model.Customer;
import com.ibm.customerCare.model.Issue;
import com.ibm.customerCare.model.Login;


public class OperatorServiceImpl implements OperatorService{

	@Autowired
	OperatorDao operatordao;
	CustomerDao customerdao;
	IssueDao issuedao;
	LoginDao logindao;
	private JavaMailSender mailSender;
	
	@Override
	public String login(Login login) {
		boolean exists=operatordao.existsById(login.getUserName());
		if(!exists) {
			return "Operator Not Found. Plzzz Register";
		}
		if(!operatordao.findById(login.getUserName()).get().getOperatorpass().equals(login.getPassword())) {
			return "Invalid Id or Password";
		}
		
		if(logindao.findById(login.getUserName()).get().isActive()==true) {
			return "Already Login";
		}	
		
		Login login2=logindao.findById(login.getUserName()).get();
		login2.setActive(true);
		logindao.save(login2);
		
		return "Login successfully";
	}

	@Override
	public String addCustomerIssue(Issue issue) {
		issuedao.save(issue);
		return "Issue Created";
	}

	@Override
	public String sendIntimationMailToCustomer(int issueId, int customerId) {
		Customer customerModified = customerdao.findById(customerId).get();
		SimpleMailMessage message = new SimpleMailMessage();
		String customerEmail = customerModified.getCustomerEmail();
		message.setTo(customerEmail);
        message.setSubject("Intimatioin Email");
        message.setText("The issue that you have reported isbeing solved by the develpoers");

        mailSender.send(message);
		return null; 
	}

	@Override
	public String modifytomerIssue(Issue issue) {
		issuedao.save(issue);
		return "Issue Updated";
	}

	@Override
	public String sendModificationMailToCustomer(int issueId, int customerId) {
		Customer customerModified = customerdao.findById(customerId).get();
		SimpleMailMessage message = new SimpleMailMessage();
		String customerEmail = customerModified.getCustomerEmail();
		message.setTo(customerEmail);
        message.setSubject("Modificaton Email");
        message.setText("Your Account has been successfully modified");

        mailSender.send(message);
		return null; 
	}

	@Override
	public String closeCustomerIssue(Issue issue) {
		issuedao.delete(issue);
		return "Department Deleted ";
	}

	@Override
	public Customer findCustomerById(int customerId) {
		Customer customer = customerdao.findById(customerId).get();
		return customer;
	}

	@SuppressWarnings({ "unchecked", "null" })
	@Override
	public List<Customer> findCustomerByName( String name) {
	    Customer[] customers = null;
		for (Customer customer : customers) {
	        if (customer.getCustomerFirstName().equals(name)) {
	            return (List<Customer>) customer;
	        }
	    }
	    return null;
	}

	@Override
	public String findCustomerByEmail(String email) {
		String customer = customerdao.findByEmail(email).getCustomerFirstName();
		return customer;
	}

	@Override
	public BooleanNode lookCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
