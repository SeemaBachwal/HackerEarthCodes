package com.two.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity {
	static private ArrayList<String> l1 = new ArrayList<String>();		
	static boolean flag = true;

	public static void main(String[] args) {
		int testCases;
		Scanner sc = new Scanner(System.in);
		testCases = sc.nextInt();
		while (testCases != 0) {
			String str1 = sc.next();
			String str2 = sc.next();
			char ch[] = str1.toCharArray();
			int fact = findFact(str1.length());
			System.out.println("Factorial is "+fact);
			swapChars(fact, ch);
			System.out.println("See what string is returned from list" +l1);
			if(l1.contains(str2)){
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
	}

	private static void swapChars(int fact, char[] ch) {
			String str = String.valueOf(ch);
			if(!l1.contains(str))
			{
				l1.add(str);
			}
			while(fact!=0){
				if((ch.length%2)!=0)
				{
					if(flag)
					{
						flag = false;
						int i=0;
						char temp	= 	ch[i+1];
						ch[i+1]	  	= 	ch[i+2];
						ch[i+2]   	=	temp;
						fact--;
						//System.out.println("Fact value in if "+fact);
						swapChars(fact, ch);
					}
					else
					{
						flag = true;
						int j = 0;
						char temp1 = ch[j];
						ch[j] = ch[j+1];
						ch[j+1] = temp1;
						fact--;
						//System.out.println("Fact value in else "+fact);
						swapChars(fact, ch);
					}
				}
				else{
					System.out.println("For even character length");
				}
				
			}
		}

	// working only 3 letter characters
/*	private static void swapChars(int fact, char[] ch) {
		String str = String.valueOf(ch);
		if(!l1.contains(str)){
			l1.add(str);
		}
		while(fact!=0){
			if(flag)
			{
				flag = false;
				int i=0;
				char temp	= 	ch[i+1];
				ch[i+1]	  	= 	ch[i+2];
				ch[i+2]   	=	temp;
				fact--;
				//System.out.println("Fact value in if "+fact);
				swapChars(fact, ch);
			}
			else
			{
				flag = true;
				int j = 0;
				char temp1 = ch[j];
				ch[j] = ch[j+1];
				ch[j+1] = temp1;
				fact--;
				//System.out.println("Fact value in else "+fact);
				swapChars(fact, ch);
			}
		}
	}*/

	private static int findFact(int length) {
		int n = 1;
		if(length == 1)
			return 1;
		while(length!=0){
			n = n * length;
			length--;
		}
		
		return n;
	}
}
