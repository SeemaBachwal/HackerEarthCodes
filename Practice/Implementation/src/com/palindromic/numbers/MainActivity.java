package com.palindromic.numbers;

import java.util.Scanner;
public class MainActivity {

	private static int findPalindromes(int a, int b) {
		
		int aa = a;
		int bb = b;
		int cnt=0;
	 for (int i = aa; i <= bb; i++) {
		if(isPalindrome(i))
			cnt++;
	 }
		return cnt;
	}
	
	private static boolean isPalindrome(int i) {
		boolean flag;
		int result = 0;
		int num = i;
		int checkNum = num;
		while(num>0)
		{
			int modNum = num%10;
			num = num/10;
			result = result*10 + modNum;
		}
		if(checkNum==result)
			flag = true;
		else
			flag = false;
		
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc .nextInt();
		sc.nextLine();
		while(testCases!=0){
			String str = sc.nextLine();
			String []strArr = str.split(" ");
			int a = Integer.parseInt(strArr[0]);
			int b = Integer.parseInt(strArr[1]);
			int count = findPalindromes(a,b);
			System.out.println(count);
			testCases--;
		}		
	}

}