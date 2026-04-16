package com.sushmit.practice;

public class Palindrom {

	public boolean isPalindrom(String str) {
		String input = str.toLowerCase();
		int i = 0;
		int j = input.length()-1;
		while(i < j) {
			if(input.charAt(i) != input.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Palindrom p = new Palindrom();
		System.out.println(p.isPalindrom("Madam"));
	}

}
