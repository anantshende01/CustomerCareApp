package com.ibm.customerCare.dao;

import com.ibm.customerCare.model.Department;
import com.ibm.customerCare.model.Operator;
import java.util.*;

public interface AdminDao{
	public String createDepartment(Department d);
	public String deleteDepartment(int id);
	public String updateDepartment(Department d);
	public Department readDepartmentById(int id);
	public String createOpertaor(Operator o);
	public String deleteOperator(int id);
	public String updateOperator(Operator o);
	public Operator readOperatorById(int id);
	public List<Operator> readAllOperators();
}