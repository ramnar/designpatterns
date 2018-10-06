package com.ramnar.struct.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private String department;
	private List<Employee> subordinates;
	
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
		this.subordinates = new ArrayList<Employee>();
	}
	
	public void add(Employee e) {
		subordinates.add(e);
	}
	
	public void remove(Employee e) {
		subordinates.remove(e);
	}
	
	public List<Employee> getSubordinates(){
		return subordinates;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}
	

}
