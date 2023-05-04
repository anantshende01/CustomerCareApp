package com.ibm.customerCare.service;

import java.util.List;

import com.ibm.customerCare.exceptions.DepartmentNotFoundException;
import com.ibm.customerCare.exceptions.DuplicateCustomerException;
import com.ibm.customerCare.exceptions.OperatorNotFoundException;
import com.ibm.customerCare.model.Department;
import com.ibm.customerCare.model.Operator;

public interface AdminService {
	public String addDepartment(Department d) throws DuplicateCustomerException;
	public String removeDepartment(int id) throws DepartmentNotFoundException;
	public String modifyDepartment(Department d) throws DepartmentNotFoundException;
	public Department findDepartmentById(int id);
	public String addOpertaor(Operator o);
	public String removeOperator(int id) throws OperatorNotFoundException;
	public String modifyOperator(Operator o) throws OperatorNotFoundException;
	public Operator findOperatorById(int id) throws OperatorNotFoundException;
	public List<Operator> findAllOperators();
}
