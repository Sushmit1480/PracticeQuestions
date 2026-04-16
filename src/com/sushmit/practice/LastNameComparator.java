package com.sushmit.practice;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
	}

}
