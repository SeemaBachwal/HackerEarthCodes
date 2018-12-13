package com.complete.string;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean isChar = true;
		System.out.println("Enter the test cases : ");
		int t = sc.nextInt();
		while (t != 0) {
			System.out.println("Enter the string : ");
			String str = sc.next().toLowerCase();
			for (char i = 'a'; i <= 'z'; i++) {
				if (!str.contains(String.valueOf(i))) {
					isChar = false;
					break;
				}
			}
			
			if (isChar)
				System.out.println("YES");
			else
				System.out.println("NO");
			t--;
			isChar = true;
		}

		sc.close();

	}

}
