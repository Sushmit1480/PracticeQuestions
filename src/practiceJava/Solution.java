package practiceJava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {


	public static void main(String[] args) {
		//find first Occurrence of number from the List
		
		List<Integer> num = Arrays.asList(10,20,30,40,50, 61, 13);
//		int ans = num.stream().findFirst().orElse(0);
//		int answ = num.stream().skip(1).findAny().orElse(0);
//		System.out.println(ans);
//		System.out.println(answ);
		
		// find how many numbers present into the list
		System.out.println(num.stream().count());
	 	
		// find the even and odd numbers from the list using stream Api
		Map<Boolean, List<Integer>> partionedNumber = num.stream().collect(Collectors.partitioningBy(numbers-> numbers%2 == 0));
		System.out.println("Even numbers are = " + partionedNumber.get(true));
		System.out.println("Odd numbers are = " + partionedNumber.get(false));

		
		
		
		
		
	}
}
		