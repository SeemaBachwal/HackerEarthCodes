package com.strange.addition;

import java.util.Scanner;

public class MainActivity {

	//Strange Addition
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String str1 = null;
		String str2 = null;
		while(t!=0)
		{
			String str = sc.nextLine();
			System.out.println("print string" +str);
			String[] strArr = str.split(" ");
			System.out.println("Length : "+strArr.length);
			if(strArr.length == 2)
			{
			str1  = strArr[0];
			str2  = strArr[1];
			}
			System.out.println("first string "+strArr[0]);
			System.out.println("Both strings are "+ str1 + " and "+str2);
			/*long a = Long.parseLong(strArr[0]);
			long b = Long.parseLong(strArr[1]);*/
			t--;
		}
	}

}
