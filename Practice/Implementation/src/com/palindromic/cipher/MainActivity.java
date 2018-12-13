package com.palindromic.cipher;

import java.util.Scanner;
public class MainActivity {
	
	static boolean isPalindrome(char[] ch) {
		int len = ch.length;
		boolean isPal = false;
		for (int i = 0; i < ch.length/2; i++) {	//vvbvelwypv
			if(ch[i] == ch[--len]){
				isPal = true;
				continue;
			}
			else{
				isPal=false;
				break;
			}
		}
		return isPal;
	}
	
	
	
	private static long findCipherVal(char[] ch) {
		long sum = 1L;
		for (int i = 0; i < ch.length; i++) {
			int charValue = (int)ch[i]-96;
			sum = sum * charValue;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t!=0){
			String str = sc.nextLine();
			char []ch = str.toCharArray();
			boolean flag = isPalindrome(ch);
			if(flag==true)
			{
				System.out.println("Palindrome");
			}
			else
			{
				long charVal = findCipherVal(ch);
				System.out.println(charVal);
				
			}
			t--;
		}
	}
}