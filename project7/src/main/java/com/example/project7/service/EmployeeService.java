package com.example.project7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.project7.module.Employee;

public interface EmployeeService {
	Employee addEmp(Employee e);
	
	Employee findById(Integer id);
	
	Employee foundById(Integer id);
	 
	List<Employee> findByAge(Integer age);
	
	Employee updateEmp(Employee e1);
	
	
	
	
	
	
	
	

}
