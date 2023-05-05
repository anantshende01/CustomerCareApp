package com.ibm.customerCare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.customerCare.model.Customer;
import com.ibm.customerCare.model.Issue;
import com.ibm.customerCare.model.Login;
import com.ibm.customerCare.service.OperatorService;


@RestController
@RequestMapping("/api/operator")
public class OperatorController {
	
	@Autowired
	OperatorService operatorService;
	
	@PostMapping("/login")
	public String login(@RequestBody Login login) {
		return operatorService.login(login);
	}

	@PostMapping("/addIssue/{operatorId}")
	public String addIssue(@RequestBody Issue issue, @PathVariable int operatorId) {
		return operatorService.addCustomerIssue(issue,operatorId);
	}

	@PostMapping("/sendIntimationMail")
	public String sendIntimationMail(@RequestBody int issueId, int customerId){
		return operatorService.sendIntimationMailToCustomer(issueId, customerId);
	}
	
	@PostMapping("/modifyIssue")
	public String modifytomerIssue(@RequestBody Issue issue){
		return operatorService.modifytomerIssue(issue);
	}
	
	@PostMapping("/sendModificationMail/{issueId}/{customerId}")
	public String sendModificationMailToCustomer(@PathVariable int issueId, int customerId){
		return operatorService.sendModificationMailToCustomer(issueId, customerId);
	}

	@PostMapping("/closeIssue/{issueId}")
	public String closeCustomerIssue (@PathVariable int issueId){
		return operatorService.closeCustomerIssue(issueId);
	}
	
	
	@GetMapping("/findCustomerById")
	public Customer findCustomerById(@RequestBody int customerId){
		return operatorService.findCustomerById(customerId);
	}
	
	
	@GetMapping("/findCustomerByName")
	public Customer findCustomerByName1(@RequestBody String name){
		return operatorService.findCustomerByName(name);
	}
	
	@GetMapping("/findCustomerByMail")
	public Customer findCustomerByEmail(String email) {
		return operatorService.findCustomerByName(email);
	}
	@PostMapping("/lockCustomer")
	public Boolean lockCustomer(int customerId){
		return operatorService.lockCustomer(customerId);
	}
	

}