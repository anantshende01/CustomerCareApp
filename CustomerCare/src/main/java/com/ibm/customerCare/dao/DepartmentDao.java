package com.ibm.customerCare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ibm.customerCare.model.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer>{

}
