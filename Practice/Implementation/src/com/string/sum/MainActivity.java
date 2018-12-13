package com.string.sum;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int value = 0;
		System.out.println("Enter the String :");
		String str = sc.next().toLowerCase();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			value = value + (int) ch[i] - 96;
		}

		System.out.println(value);
		sc.close();

	}

}
