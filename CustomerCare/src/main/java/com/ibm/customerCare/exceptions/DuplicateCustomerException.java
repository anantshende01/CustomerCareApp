package com.ibm.customerCare.exceptions;

public class DuplicateCustomerException extends RuntimeException{
	public DuplicateCustomerException(String message) {
		super(message);
	}
}
