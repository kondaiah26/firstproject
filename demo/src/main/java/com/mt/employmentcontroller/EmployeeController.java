package com.mt.employmentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mt.employmanagementservices.EmployeeServices;
import com.mt.employmanagementutil.Employee;

@RestController
@RequestMapping("/address")
public class EmployeeController {
	@Autowired
	private EmployeeServices empservices;
	@PostMapping("/saveEmployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return empservices.addEmployee(emp);
		
	}
	@GetMapping("getEmployee/{id}")
	public Employee findEmployeeById(@PathVariable int id){
		return empservices.getEmployee(id);
		
	}
	@DeleteMapping("/removeEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return empservices.deleteEmployee(id);
		
	}
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@PathVariable Employee emp) {
		return empservices.updateEmployee(emp);
		
	}
	
	
	

}
