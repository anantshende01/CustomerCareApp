package com.ibm.customerCare.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ibm.customerCare.model.Operator;

@Repository
public interface OperatorDao extends JpaRepository<Operator, Integer>{

}
