package com.sushmit.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupUsersAccordingCity {

	public static void main(String[] args) {
		List<User> users = Arrays.asList(
				new User(1, "Sushmit", "Pune"),
				new User(2, "Anchal", "Pune"),
				new User(3, "Siddhant", "Nagpur"),
				new User(4, "Onkar", "Jalna"),
				new User(5, "Abhay", "Beed"),
				new User(6, "Nikhil", "Jalgaon"),
				new User(7, "Kalpesh", "Pune")
				);
		
		Map<String, List<User>> map = users.stream().collect(Collectors.groupingBy(User::getCity));
		for(Map.Entry<String, List<User>> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ ":");
			for(User user: entry.getValue()) {
				System.out.println("Name: " + user.getName()+" ,"+ user.getId());
			}
			System.out.println("-----------------------------");
		}
	}

}
