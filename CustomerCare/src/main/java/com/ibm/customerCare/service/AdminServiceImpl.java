package com.ibm.customerCare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.customerCare.dao.AdminDao;
import com.ibm.customerCare.dao.DepartmentDao;
import com.ibm.customerCare.dao.OperatorDao;
import com.ibm.customerCare.model.Department;
import com.ibm.customerCare.model.Operator;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	
	AdminDao adminDao;
	@Autowired
	DepartmentDao deptDao;
	OperatorDao operatorDao;

	@Override
	public String addDepartment(Department d) {
		boolean exists = deptDao.existsById(d.getDepartmentId());
		if(exists) {
			return "Department already exists";
		}
		
		deptDao.save(d);
		return "Department Created";
	}

	@Override
	public String removeDepartment(int id) {
		boolean exists = deptDao.existsById(id);
		if(!exists) return "Department doesn't exists";
		
		deptDao.deleteById(id);
		
		return "Department Deleted ";
	}

	@Override
	public String modifyDepartment(Department d) {
		boolean exists = deptDao.existsById(d.getDepartmentId());
		if(!exists) return "Department doesnt exist";
		
		deptDao.save(d);
		return "Department Updated";
	}

	@Override
	public Department findDepartmentById(int id) {
		Department department = deptDao.findById(id).get();
		return department;
	}

	@Override
	public String addOpertaor(Operator o) {
		boolean exists = operatorDao.existsById(o.getOperatorId());
		if(exists) return "Operator already exists";
		
		operatorDao.save(o);
		return "Operator Created";
	}

	@Override
	public String removeOperator(int id) {
		boolean exists = operatorDao.existsById(id);
		if(!exists) return "Operator doesnn't exists";
		
		operatorDao.deleteById(id);
		
		return "Operator Deleted ";
	}

	@Override
	public String modifyOperator(Operator o) {
		boolean exists = operatorDao.existsById(o.getOperatorId());
		if(!exists) return "Operator doesn't exists";
		
		operatorDao.save(o);
		return "Operator Updated";
	}

	@Override
	public Operator findOperatorById(int id) {
		boolean exists = operatorDao.existsById(id);
		if(!exists) return null;
		
		Operator operator = operatorDao.findById(id).get();	
		return operator;
	}

	@Override
	public List<Operator> findAllOperators() {
		List<Operator> operators = operatorDao.findAll();
		return operators;
	}

}
