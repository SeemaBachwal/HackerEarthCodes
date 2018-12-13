package com.palindrome;

import java.util.Scanner;

public class Gen {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");
			String str = sc.next().toLowerCase();
			StringBuffer sb = new StringBuffer(str);
			StringBuffer revstr = sb.reverse();
			if(sb.equals(revstr))
			{
				System.out.println("YES");
			}
			else
				System.out.println("NO");
			sc.close();

	}

}
