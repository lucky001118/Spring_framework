package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	 private int employee_id;
	@Column(name = "Employee_name")
	 private String name;
	 private int salery;
	 @ManyToOne
	 private Department department;

	public Employee(int employee_id, String name, int salery, Department department) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.salery = salery;
		this.department = department;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalery() {
		return salery;
	}

	public void setSalery(int salery) {
		this.salery = salery;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
