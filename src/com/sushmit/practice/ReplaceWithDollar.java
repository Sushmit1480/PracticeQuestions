package com.sushmit.practice;

public class ReplaceWithDollar {

	public static void main(String[] args) {
		String input = "tomorrow";
		
		// If want to replace 'o' with only '&'
		System.out.println(input.replaceAll("o", "$"));
		
		// If want to replace the 'o' according to the counter
		char[] arr = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		int oCounter = 0;
		for(char c: arr) {
			if(c == 'o') {
				oCounter++;
				sb.append("$".repeat(oCounter));
			}else {
				sb.append(c);
			}
		}
		
		System.out.println(sb.toString());
	}

}
