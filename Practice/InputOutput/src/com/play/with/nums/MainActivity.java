package com.play.with.nums;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		while(q!=0){
			int l = sc.nextInt();
			int r = sc.nextInt();
			int sum = 0;
			for (int i = l-1; i < r; i++) {
				sum = sum + arr[i];
			}
				int avg = sum/(r-l+1);
				System.out.println(avg);
			q--;
		}
	}

}
