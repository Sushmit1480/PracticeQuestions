package com.sushmit.practice;

import java.util.Objects;

public class Employee {

	private String firstName;
	private String lastName;
	private int rollNo;
	private String gender;
	private double salary;
	
	public Employee(String firstName, String lastName, int rollNo, String gender, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.gender = gender;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, rollNo, gender, salary);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Employee)) return false;
		Employee e = (Employee) o;
		return Objects.equals(firstName, e.firstName) && Objects.equals(lastName, e.lastName)
				&& Objects.equals(gender, e.gender) && Double.compare(salary, e.salary) == 0 && Integer.compare(rollNo, e.rollNo) == 0;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", rollNo=" + rollNo + ", gender="
				+ gender + ", salary=" + salary + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
