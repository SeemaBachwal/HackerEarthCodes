package com.illegible.string;

import java.util.Scanner;

public class MainActivity {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		if(n==str.length()){
			int i;
			if(str.contains("w")){
				i = str.replace("w", "vv").length();
				System.out.println("STring len "+i);
			}
				
			//char ch[] = str.toCharArray();
			//System.out.println("Now String length is "+ch.length);
			

		}
	}
}