package com.mt.employmanagementservices;

import org.springframework.beans.factory.annotation.Autowired;

import com.mt.employmanagementrepository.AddressRepository;
import com.mt.employmanagementrepository.EmployeeRepository;
import com.mt.employmanagementutil.Employee;

public class EmployeeServiceImplemetation implements EmployeeServices {
	@Autowired
	private AddressRepository addressrepo;
	@Autowired
	private EmployeeRepository emprepository;

	public Employee addEmployee(Employee employee) {
		return emprepository.save(employee);
	}

	public Employee getEmployee(int id) {

		return emprepository.findById(id).orElse(null);
	}

	public String deleteEmployee(int id) {

		emprepository.deleteById(id);
		return "employee removed" + id;

	}

	public Employee updateEmployee(Employee emp) {
		Employee exists =emprepository.findById(emp.getEId()).orElse(null);
		exists.setEName(emp.getEName());
		exists.setDept(emp.getDept());
		exists.setAddress(emp.getAddress());
		return emprepository.save(exists);
	}

	

}
