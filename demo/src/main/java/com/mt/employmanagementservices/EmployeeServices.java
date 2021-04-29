package com.mt.employmanagementservices;

import org.springframework.stereotype.Service;

import com.mt.employmanagementutil.Employee;
@Service
public interface EmployeeServices {
	public Employee addEmployee(Employee employee);
	public Employee getEmployee(int id);
	public String deleteEmployee(int id);
	public Employee updateEmployee(Employee emp);

}
