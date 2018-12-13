package com.count.numbers;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		char num[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases:");
		int t = sc.nextInt();

		System.out.println("Enter the length of the string");
		int n = sc.nextInt();
		while (t != 0) {
			System.out.println("Enter the String: ");
			String str = sc.next();
			char ch[] = str.toCharArray();

			if (str.length() == n) {

				for (int i = 0; i < ch.length; i++) {

					for (int j = 0; j < num.length; j++) {

						if (ch[i] == num[j] && ch[i + 1] == num[j])
							++count;
							else if (ch[i] == num[j]) {
								++count;
							}
					}
				}
			}
			t--;
		}
		System.out.println(count);
		sc.close();

	}

}
