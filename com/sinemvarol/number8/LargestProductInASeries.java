package com.sinemvarol.number8;

import java.util.Scanner;

public class LargestProductInASeries {
	
	private static void findThirteenAdjacentDigits() {
		
		long greatestProduct = Long.MIN_VALUE;
		long currentProduct = 1;
		String input = "";
	//	int[] array = new int [1000];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter input: ");
		input = scanner.nextLine();
		
//		for (int i = 0; i< 1000; i++) {
//			input[i] = Integer.valueOf(scanner.next)
//		}
		
		System.out.println("- - - - -\n");
		System.out.println("input: \n");
		
		for (int i = 0; i < input.length()-13; i++) {
			for (int j = i; j < i + 13; j++) {
				currentProduct *= Character.getNumericValue(input.charAt(j));
			}
			if (currentProduct > greatestProduct) {
				greatestProduct = currentProduct;
			}
			System.out.println("current product: " + currentProduct);
			currentProduct = 1;
		}	
		
		System.out.println("greatest product: " + greatestProduct);
		
	}

	public static void main(String[] args) {
		
		findThirteenAdjacentDigits();
	}

}
