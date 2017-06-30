package com.javamultiplex.creational.prototype;

import java.util.List;

public class TestPrototypePattern {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.loadData();
		try {
			Employee employee1 = (Employee) employee.clone();
			Employee employee2 = (Employee) employee.clone();
			List<String> list1 = employee1.getEmployee();
			list1.add("Shubham");
			List<String> list2 = employee2.getEmployee();
			list2.remove("Rohit");
			System.out.println("Original : " + employee.getEmployee());
			System.out.println("Cloned : " + list1);
			System.out.println("Cloned : " + list2);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
