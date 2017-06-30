package com.javamultiplex.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

	private List<String> employee;

	public Employee() {
		employee = new ArrayList<>();
	}

	public Employee(List<String> employee) {
		super();
		this.employee = employee;
	}

	public List<String> getEmployee() {
		return employee;
	}

	public void loadData() {
		employee.add("Rohit");
		employee.add("Bhavna");
		employee.add("Shivani");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		// Deep copy
		List<String> empList = new ArrayList<>();
		for (String name : this.getEmployee()) {
			empList.add(name);
		}
		return new Employee(empList);
	}

}
