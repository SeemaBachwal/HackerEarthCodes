package com.toggle.string;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int value = (int) (ch[i]);
			// UpperCase Range
			if (value >= 65 && value <= 90) {
				ch[i] = Character.toLowerCase(ch[i]);
			}
			// LowerCase Range
			else if (value >= 97 && value <= 122) {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(ch);
		sc.close();
	}
}
