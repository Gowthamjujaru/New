package com.example.project7.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project7.module.Employee;
import com.example.project7.repo.EmployeeRepo;
import com.example.project7.service.EmployeeService;

import exception.ReSourceNotFound;
@Service
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	EmployeeRepo repo;

	@Override
	public Employee addEmp(Employee e) {
		
		return repo.save(e);
	}

	@Override
	public Employee findById(Integer id) {
		
		Employee e = repo.findById(id).orElse(null);
		if(e!=null) {
			return e;
		}
		else {
			throw new ReSourceNotFound("Employee","Id",id);
		}
	}
	@Override
	public List<Employee> findByAge(Integer age){
		List<Employee> l1=repo.findByAge(age);
		if(l1.size()!=0) {
			return l1;
		}
		else {
			throw new ReSourceNotFound("Employee","age", age);
		}
	}

	

	@Override
	public Employee updateEmp(Employee e1) {
		Employee e2 = repo.findById(e1.getId()).orElse(null);
		if(e2!=null) {
			e2.setAge(e1.getAge());
			e2.setEmail(e1.getEmail());
			e2.setName(e1.getName());
			e2.setPhno(e1.getPhno());
			e2.setSal(e1.getSal());
			return repo.save(e2);
		}
		else {
		throw new ReSourceNotFound("Employee","Id",e1.getId());	
		}
		
		
		
	}

	@Override
	public Employee foundById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}

