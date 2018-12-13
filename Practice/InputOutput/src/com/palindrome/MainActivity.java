package com.palindrome;

import java.util.Scanner;

public class MainActivity {

	public static boolean isPalindrome(char[] a) {
		boolean flag = true;
		int len = a.length;
		for (int i = 0; i < len; i++) {

			if (a[i] != a[len - i - 1]) {
				flag = false;
				break;
			}

		}

		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next().toLowerCase();
		char ch[] = str.toCharArray();
		if (isPalindrome(ch))
			System.out.println("YES");
		else
			System.out.println("NO");
		sc.close();

	}

}
