package com.sushmit.practice;

import java.util.Comparator;

public class MarksComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Integer marks1 = (Integer) o1;
		Integer marks2 = (Integer) o2;
		return marks2.compareTo(marks1);
	}

}
