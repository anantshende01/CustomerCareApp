package com.ibm.customerCare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.customerCare.dao.OperatorDao;
import com.ibm.customerCare.model.Customer;
import com.ibm.customerCare.model.Issue;
import com.ibm.customerCare.model.Login;
import com.ibm.customerCare.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@Autowired
	OperatorDao operatorDao;
	
	@PostMapping("/add")
	public String add(@RequestBody Customer customer) {
		return customerService.registerCustomer(customer);
	}
	
	@PutMapping("/login")
	public String login(@RequestBody Login login) {
		return customerService.login(login);
	}
	
	@PutMapping("/change")
	public String changePassword(@RequestBody Login login) {
		return customerService.changePassword(login);
	}
	
	@PutMapping("/logout")
	public String logout(@RequestBody Login login) {
		return customerService.logout(login);
	}
	
	@GetMapping("/getAllIssues/{customerId}")
	public List<Issue> getAllIssues(@PathVariable int customerId) {
		return customerService.viewAllIssues(customerId);
	}
	
	@GetMapping("/getIssue/{issueId}")
	public Issue getIssue(@PathVariable int issueId) {
		return customerService.viewIssueById(issueId);
	}
	
	@PostMapping("/reopenIssue/{issueId}")
	public Issue reopenIssue(@PathVariable int issueId) {
		return customerService.reopenIssue(issueId);
	}
	
	@PostMapping("/forget/{id}")
	public String forget(@PathVariable(value = "id") int customerId,@RequestBody String newPassword) {
		return customerService.forgotPassword(customerId, newPassword);
	}

}
