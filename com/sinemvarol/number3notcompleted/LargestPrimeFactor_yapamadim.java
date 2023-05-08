package com.sinemvarol.number3notcompleted;

public class LargestPrimeFactor_yapamadim {

	public static void main(String[] args) {
			
		largestPrimeFactor(13195L);
	}
	
	public static long largestPrimeFactor(long number) {
		long largestPrimeFactor = 1;
		boolean check = false;
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						check = false;
					}
					
					if (i % j != 0) {
						check = true;
						largestPrimeFactor = i;	
						System.out.println("asal bölen: " + largestPrimeFactor);
					}
					
				}
			}
		}		
		
		return largestPrimeFactor;
	}

}
