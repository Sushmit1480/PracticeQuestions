package com.sushmit.practice;

import java.util.Arrays;

public class Anagram {

	public boolean isAnagram(String s1, String s2) {
		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	
	public static void main(String[] args) {
		Anagram a = new Anagram();
		System.out.println(a.isAnagram("eat", "ate"));
	}
}
