package com.dlabs.java8_workouts.stream;

import java.util.Arrays;
import java.util.List;

public class CollectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp john = new Emp("E123", "John Nhoj", 200.99, "IT");
		Emp south = new Emp("E223", "South Htuos", 299.99, "Sales");
		Emp reet = new Emp("E133", "Reet Teer", 300.99, "IT");
		Emp prateema = new Emp("E143", "Prateema Rai", 300.99, "Benefits");
		Emp yogen = new Emp("E323", "Yogen Rai", 200.99, "Sales");
		List<Emp> emps = Arrays.asList(john, south, reet, prateema, yogen);
		
		// Finding Average Salary
		//Double averageSalary = emps.stream().collect(averagingDouble(Employee::getSalary));
	}

}

class Emp {
	private String empId;
	private String name;
	private Double salary;
	private String department;

	public Emp(String empId, String name, Double salary, String department) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
