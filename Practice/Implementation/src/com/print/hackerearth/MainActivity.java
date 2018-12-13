package com.print.hackerearth;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the string :");
		int n = sc.nextInt();
		System.out.println("Enter the String : ");
		String str = sc.next();
		int count4 = 0,count3 = 0;
		char ch[] = null;
		// char arr[] = {'a','e','h','r','c','k','t'};
		
		if (str.length() == n) {
			ch = str.toCharArray();
			for (int i = 0; i < ch.length; i++) {

				if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'h' || ch[i] == 'r') {

					count4++;
				}

				if (ch[i] == 'c' || ch[i] == 'k' || ch[i] == 't') {

					count3++;
				}
				
				
			}

		}
		System.out.println("Count4 is "+count4);
		System.out.println("Count3 is "+count3);
		if(count4 >= 8 && count3 <= 3)
			System.out.println("U can print hackerearth once");
		sc.close();
	}

}
