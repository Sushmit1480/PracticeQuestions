package com.sushmit.practice;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> opt1 = Optional.of("Java");
		System.out.println(opt1.get());
		
		Optional<String> opt2 = Optional.ofNullable(null);
		System.out.println(opt2.isPresent());
		
		Optional<String> opt3 = Optional.empty();
		System.out.println(opt3);
	}
}
