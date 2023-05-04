package com.ibm.customerCare.exceptions;

public class DepartmentNotFoundException extends RuntimeException{
	public DepartmentNotFoundException(String message) {
		super(message);
	}
}
