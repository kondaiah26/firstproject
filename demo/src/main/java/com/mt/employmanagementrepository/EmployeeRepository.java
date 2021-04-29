package com.mt.employmanagementrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mt.employmanagementutil.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
