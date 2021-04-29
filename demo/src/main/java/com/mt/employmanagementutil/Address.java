package com.mt.employmanagementutil;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="employeeAddress")
public class Address {
	@Id
	@GeneratedValue
	
	private int aId;
	private String colony;
	private String state;
	
	}
