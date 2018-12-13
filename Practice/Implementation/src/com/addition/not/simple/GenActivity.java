package com.addition.not.simple;

import java.util.Scanner;

public class GenActivity {

	public static void main(String[] args) {

		 char arr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		 
		 int len = arr.length;
		 System.out.println("Length of Array is "+len);
		 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String");
			String str = sc.next();
			StringBuffer sb = new StringBuffer(str);
			
			StringBuffer rev =  sb.reverse();
			char ch[] = str.toCharArray();
			char chrev[] = rev.toString().toCharArray();
	}

}
