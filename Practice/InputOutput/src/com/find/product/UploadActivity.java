package com.find.product;

import java.util.Scanner;

public class UploadActivity {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array :");
		int n = sc.nextInt();
		System.out.println("Enter the array elements :");
		int arr[] = new int[n];
		int answer = 1;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				answer = (int)((answer * arr[i]) % (Math.pow(10, 9)) + 7);
			}
		System.out.println(answer);
		sc.close();
	}
}
