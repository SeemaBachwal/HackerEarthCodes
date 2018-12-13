package com.count.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UploadActivity {
	public static void main(String[] args) {
		List<String> strArr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of test cases:");
		int t = sc.nextInt();
		while (t != 0) {
			//System.out.println("Enter the length of the string");
			int n = sc.nextInt();
			sc.nextLine();
			//System.out.println("Enter the String: ");
			String str = sc.nextLine();
			if (str.length() == n) {
				str = str.replaceAll("[^0-9]+", " ");
				strArr = Arrays.asList(str.trim().split(" "));
			}
			//System.out.println("The count is : " + strArr.size());
			System.out.println(strArr.size());
			t--;
		}
		sc.close();
	}
}
