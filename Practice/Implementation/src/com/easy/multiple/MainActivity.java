package com.easy.multiple;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases :");
		int t = sc.nextInt();
		int ans = 0;
		while (t != 0) {
			System.out.println("Enter the number :");
			int n = sc.nextInt();

			for (int i = 1; i < n; i++) {

				if (i % 3 == 0 || i % 5 == 0) {
					ans = ans + i;
				}
			}
			System.out.println("The sum of all mutiples of 3 or 5 is : " + ans);
			ans=0;
			t--;
		}
		sc.close();
	}

}
