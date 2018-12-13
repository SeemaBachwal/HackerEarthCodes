package com.great.kian;

import java.util.Scanner;

public class UploadActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int intArr[] = new int[n];
		sc.nextLine();
		String[] strArr = sc.nextLine().split(" ");

		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i].toString());
		}
		if (intArr.length < 3) 
		{
			for (int i = 0; i < intArr.length; i++) {
				int add = intArr[i];
				System.out.print(add + " ");
			}
			System.out.print("0");
		} 
		else
		{
			for (int i = 0; i < 3; i++) 
			{
				int add = 0;
				add = add + intArr[i];
				int incr = i+3;
				while(incr<intArr.length){
					add = add + intArr[incr];
					incr = incr+3;
				}
				System.out.print(add+" ");
			}	
		}
	}
}