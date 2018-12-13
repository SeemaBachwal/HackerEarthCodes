package com.minmax;

import java.util.Arrays;
import java.util.Scanner;
public class MainActivity {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		sc.nextLine();
		String str = sc.nextLine();
		String strArr[] = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length-1];
		for (int i = min; i < max; i++) {
			if(str.contains(String.valueOf(i))){
				if(i==(max-1))
					System.out.println("YES");
				else
					continue;
			}
			else
			{
				System.out.println("NO");
				break;
			}
				
		}
	}
}