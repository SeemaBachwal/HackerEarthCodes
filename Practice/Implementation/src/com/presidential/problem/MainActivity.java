package com.presidential.problem;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int l = 0, r = 0, newVal = 0, n = 0;
		char newChar = '0';
		System.out.println("Enter number of test cases: ");
		int t = sc.nextInt();
		System.out.println("Enter the number of queries");
		int q = sc.nextInt();
		System.out.println("Enter the String");
		String A = sc.next().toLowerCase();
		sc.nextLine();

		char ch[] = A.toCharArray();
		System.out.println(ch);

		while (q != 0) {
			System.out.println("Enter the cyclic range L and R:");
			String str = null;

			str = sc.nextLine();
			String[] split2 = str.split(" ");
			if (split2.length == 2) {
				l = Integer.parseInt(split2[0])-1;
				r = Integer.parseInt(split2[1])-1;
			}

			if (l < ch.length && r < ch.length) {
				for (int i = l; i <= r; i++) {

					// One letter Incremented

					/*
					 * newVal = (int) (ch[i] + 1); newChar = (char) (newVal);
					 * ch[i] = newChar;
					 */

					// System.out.println(newVal+"\t"+newChar);

					// *********************************

					// One letter Decremented

					newVal = ((int) ch[i] - 1);

					if (newVal == 96)
						newVal = newVal + 26;
					
					newChar = (char) (newVal);
					ch[i] = newChar;

					// System.out.println(newVal+"\t"+newChar);

				}
			}

			q--;
		}

		System.out.println("The new String formed before cyclic shift\t"+A);
		String B = new String(ch);
		System.out.println("The new String formed after cyclic shift \t"+B);

		sc.close();

	}

}
