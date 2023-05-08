package com.sinemvarol.number2;

public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		
		long sumEven = 2;
		long lastOne = 1;
		long lastTwo = 2;
		
		for (long i = 0; i < 4000000; i++) {
			if (i == (lastOne + lastTwo)) {
				lastOne = lastTwo;
				lastTwo = i;
				System.out.println("yeni fibonacci sayısı: " + i);
				if (i % 2 == 0) {
					sumEven += i;
					System.out.println("eklenen çift sayı: " + i);
				}
			}
		}
		
		System.out.println("Sum of even valued terms: " + sumEven);

	}

}
