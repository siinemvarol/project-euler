package com.sinemvarol.number6;

public class SumSquareDifference {

	public static void sumSquareDifference() {

		long sumOfTheSquares = 0;
		long squareOfTheSum = 0;
		long difference = 0;

		for (int i = 0; i < 101; i++) {
			sumOfTheSquares += i * i;
			squareOfTheSum += i;
		}
		squareOfTheSum *= squareOfTheSum;
		difference = squareOfTheSum - sumOfTheSquares;
		System.out.println(difference);

	}

	public static void main(String[] args) {

		sumSquareDifference();

	}

}
