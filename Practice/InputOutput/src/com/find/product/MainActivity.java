package com.find.product;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array :");
		int n = sc.nextInt();
		System.out.println("Enter the array elements :");
		int arr[] = new int[n];
		sc.nextLine();
		String str = sc.nextLine();
		String split[] = str.split(" ");
		int answer = 1;
		if (split.length == n) {

			for (int i = 0; i < split.length; i++) {

				arr[i] = Integer.parseInt(split[i]);

			}

		}
		for (int i = 0; i < arr.length; i++) {

			answer = (int) ((answer * arr[i]) % (Math.pow(10, 9) + 7));
		}

		System.out.println(answer);
		sc.close();

	*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array :");
		//int n = sc.nextInt();
		long n = sc.nextLong();
		System.out.println("Enter the array elements :");
		//int arr[] = new int[n];
		long arr[] = new long[(int) n];
		int answer = 1;
		
			for (int i = 0; i < n; i++) {

				//arr[i] = sc.nextInt();
				arr[i] = sc.nextLong();

			}
		for (int i = 0; i < n; i++) {

			answer = (int) ((answer * arr[i]) % ((Math.pow(10, 9)) + 7));
		}

		System.out.println(answer);
		sc.close();

	
	}
}
