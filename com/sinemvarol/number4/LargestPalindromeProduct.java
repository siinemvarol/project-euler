package com.sinemvarol.number4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LargestPalindromeProduct {
	
	private static void threeDigitPalindrome() {
		
		List<Integer> palindromeNumbers = new ArrayList<>();
		
		int remainder;
		
		for (int i = 100; i <= 999; i++) {
			
			for (int j = 100; j <= 999; j++) {
				
				int sum = 0;
				int number = i * j;
				int temporary = number;
				
				while (number > 0)	{
					remainder = number % 10;
					sum = (sum * 10) + remainder;
					number = number / 10;
				}
				
				if (temporary == sum) {
					System.out.println(temporary + " is palindrome");
					palindromeNumbers.add(temporary);
				}
				
			}
		}
		
		int max = 0;
		
		Iterator<Integer> iterator = palindromeNumbers.iterator();
		while (iterator.hasNext()) {
			if (iterator.next() > max) {
				max = iterator.next();
			}	
			
		}
		System.out.println("Biggest palindrome: " + max);
		
	}
	
	public static void main(String[] args) {
		
		threeDigitPalindrome();
		
	}

}
