package com.sinemvarol.number9;

public class SpecialPythagoreanTriplet {

	private static void findPythagoreanTriplet() {

		int k = Integer.MAX_VALUE;
		boolean check = false;

		while (check == false) {
			for (int i = 1; i < 1000; i++) {
				for (int j = 1; j < 1000; j++) {
					if (j > i && k > j) {
						k = 1000 - i - j;
						if (((i * i) + (j * j)) == (k * k)) {
							System.out.println("i: " + i + " j: " + j + " k: " + k);
							System.out.println("Product abc: " + (i * j * k));
							check = true;
						}
					}

				}
			}
		}

	}

	public static void main(String[] args) {

		findPythagoreanTriplet();

	}

}
