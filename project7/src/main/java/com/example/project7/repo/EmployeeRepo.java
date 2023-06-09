package com.example.project7.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.project7.module.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	@Query(value="select * from emp where eage=?1",nativeQuery = true)
	List<Employee> findByAge(Integer age);
	

}
