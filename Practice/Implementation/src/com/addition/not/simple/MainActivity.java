package com.addition.not.simple;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of test cases:");
		int t = sc.nextInt();
		while (t!=0){
		System.out.println("Enter the String");
		String str = sc.next();
		StringBuffer sb = new StringBuffer(str);
		
		StringBuffer rev =  sb.reverse();
		
		System.out.println("The reverse string is :"+rev);
		
		char ch[] = str.toCharArray();
		char chrev[] = rev.toString().toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			//System.out.print("the character is "+ch[i]);
			
			int value = ((int)ch[i] - 96);
			int revvalue = ((int)chrev[i] - 96);
			
			
			
			/*System.out.println(" for "+i+" character "+value);
			System.out.println(" for "+i+" character "+revvalue);*/
			
			int add = (value+revvalue)+96;

			if(add>122)
			{
				add = add-26;
			}
			
			char result = (char)(add);
			
			
			System.out.print(result);
			//System.out.println();
		}
		System.out.println();
		t--;
		}
	
		sc.close();
		
	}

}
