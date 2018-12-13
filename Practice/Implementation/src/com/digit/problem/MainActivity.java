package com.digit.problem;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for x and k");
		String str = null;
		String x = null, k = null;
		str = sc.nextLine();
		String[] split = str.split(" ");
		if (split.length == 2) {

			x = split[0];
			k = split[1];
		}
		int kk = Integer.parseInt(k);

		char ch[] = x.toCharArray();
		int len = ch.length;
		for (int i = 0; i < ch.length; i++) {

			if (((int) ch[i]) != 57 && kk != 0) {
				ch[i] = 57;
				kk--;
			}

		}
		for (int i = 0; i < ch.length; i++) {

			System.out.print(ch[i]);
		}

		sc.close();

	}

}
