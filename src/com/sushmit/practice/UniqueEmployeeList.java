package com.sushmit.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueEmployeeList {

	public static void main(String[] args) {
		Employee e1 = new Employee("Max", "Well", 1, "Male", 20000);
		Employee e2 = new Employee("Max", "Dow", 2, "Female", 25000);
		Employee e3 = new Employee("Max", "Well", 1, "Male", 20000);
		Employee e4 = new Employee("Max", "Smith", 3, "Male", 45000);
		Employee e5 = new Employee("Max", "Adam", 4, "Female", 30000);
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5);
//		System.out.println(list);
		List<Employee> uniqueEmployee = list.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueEmployee);
		Collections.sort(uniqueEmployee, new LastNameComparator());
		System.out.println(uniqueEmployee);
		
		Collections.sort(uniqueEmployee, new SalaryComparator());
		System.out.println(uniqueEmployee);
		double avg = uniqueEmployee.stream().filter(e -> e.getGender().equals("Female"))
				.mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println(avg);
		
		Employee e = uniqueEmployee.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst().orElse(null);
		System.out.println(e);
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int fourth = nums.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst().orElse(0);
		System.out.println(fourth);
	}

}
