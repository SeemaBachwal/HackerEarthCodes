package com.count.divisors;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int l = 0, r = 0, k = 0, count = 0;
		System.out.println("Enter the range values and the divisor:");
		String str = sc.nextLine();
		String split[] = str.split(" ");
		if (split.length == 3) {

			l = Integer.parseInt(split[0]);
			r = Integer.parseInt(split[1]);
			k = Integer.parseInt(split[2]);

		}

		for (int i = l; i <= r; i++) {

			if (i % k == 0) 
				++count;
				
		}
		System.out.println(count);
	}

}
