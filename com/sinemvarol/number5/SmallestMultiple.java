package com.sinemvarol.number5;

public class SmallestMultiple {

	public static void main(String[] args) {

		int number = 1;
		int division = 1;

		while (division < 21) {
			if (number % division == 0) {
				division++;
			} else {
				number++;
				division = 1;
			}
		}
		System.out.println(number);
	}
}
