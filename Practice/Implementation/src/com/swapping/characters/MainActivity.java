package com.swapping.characters;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the test cases : ");
		int t = sc.nextInt();
		while (t != 0) {
			char temp = ' ';
			System.out.println("Enter the string length : ");
			int n = sc.nextInt();
			System.out.println("Enter the string to be swapped : ");
			String str = sc.next();
			char ch[] = str.toCharArray();
			for (int i = 0; i < ch.length - 1; i = i + 2) {
				temp = ch[i];
				ch[i] = ch[i + 1];
				ch[i + 1] = temp;
			}
			int k = 0, j = 0;
			while (n != 1) {
				// char blockchar = ch[k];
				for (j = k + 1; j < ch.length - 1; j = j + 2) {
					temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
				k++;
				n--;
			}
			for (int i = 0; i < ch.length; i++) {
				System.out.print(ch[i]);
			}
			System.out.println("\n");
			t--;
		}
		sc.close();
	}

}
