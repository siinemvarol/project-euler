package com.sinemvarol.number7;

public class Prime10001 {

	public static void find10001stPrime() {

		int primeNumberCounter = 0;
		boolean primeNumberCheck = true;
		int currentPrimeNumber = 0;

		while (primeNumberCounter < 10001) {
			for (int i = 2; primeNumberCounter < 10001; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						primeNumberCheck = false;
					}
				}
				if (primeNumberCheck) {
					primeNumberCounter++;
					currentPrimeNumber = i;
					System.out.println("prime number counter: " + primeNumberCounter);
					System.out.println(" current prime number : " + currentPrimeNumber);

				}
				primeNumberCheck = true;

			}
			break;

		}
		System.out.println("final: " + currentPrimeNumber);

	}

	public static void main(String[] args) {

		find10001stPrime();
	}

}
