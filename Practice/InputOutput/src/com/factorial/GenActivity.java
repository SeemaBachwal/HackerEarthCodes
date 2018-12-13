package com.factorial;

import java.util.Scanner;

public class GenActivity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer whose factorial is to be found");
		int n = sc.nextInt();
		int fact = 1;
		if (n != 0) {
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
		}
		System.out.println("The Factorial of " + n + " is " + fact);
		sc.close();
	}
}
