package com.factorial;

import java.util.Scanner;

public class NewActivity {

	public static int findfact(int num) {

		int ans = 1;
		for (int i = 1; i <= num; i++) {
			ans = ans * i;
		}

		return ans;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer whose factorial is to be found");
		int n = sc.nextInt();
		int fact = 0;
		if (n != 0) {

			fact = findfact(n);
			System.out.println("The Factorial of " + n + " is " + fact);
		} else
			System.out.println("The Factorial of " + n + " is 1");
		sc.close();

	}

}
