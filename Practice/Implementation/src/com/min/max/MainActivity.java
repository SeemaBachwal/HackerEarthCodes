package com.min.max;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int min = 0, max = 0;

		System.out.println("Enter the maximum size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];

		String str = null;
		sc.nextLine();

		/*
		 * System.out.println("Enter array elements :"); for (int i = 0; i < n;
		 * i++) {
		 * 
		 * arr[i]=sc.nextInt(); } n--;
		 */
		System.out.println("Enter array elements :");
		str = sc.nextLine();
		if (str.length() == n) {

			String[] split = str.split(" ");

			for (int i = 0; i < split.length; i++) {

				arr[i] = Integer.parseInt(split[i]);
				System.out.println(arr[i]);
			}
		}
		

	/*	for (int i = 0; i < n; i++) {

			System.out.println(arr[i]);
		}
*/
	}

}
