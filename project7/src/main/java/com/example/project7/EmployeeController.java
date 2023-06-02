package com.example.project7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project7.module.Employee;
import com.example.project7.service.EmployeeService;
import com.example.project7.serviceimpl.EmployeeServiceimpl;

import jakarta.servlet.http.HttpSession;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	//localhost:9091/addEmp
	@PostMapping("addEmp")
	ResponseEntity<Employee>addEmp(@RequestBody Employee e) {
		return new ResponseEntity<Employee>(service.addEmp(e),HttpStatus.CREATED);
	}
	
	@GetMapping("findById")
	ResponseEntity<Employee> findById(@RequestHeader Integer id ){
		return new ResponseEntity<Employee>(service.findById(id),HttpStatus.FOUND);
		
		
	}
	@GetMapping("findByAge")
	ResponseEntity<List<Employee>> findByAge(@RequestParam Integer age){
		return new ResponseEntity<List<Employee>>(service.findByAge(age),HttpStatus.FOUND);
	}
	@PutMapping("update")
	ResponseEntity<Employee> updateEmp(@RequestBody Employee e1){
		return new ResponseEntity<Employee>(service.updateEmp(e1),HttpStatus.ACCEPTED);
	}

} 
