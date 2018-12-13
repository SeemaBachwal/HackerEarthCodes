package com.life.universe.everything;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		/*		  
		 int n = 0; 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the number : ");
		 n=sc.nextInt(); 
		 while (n!= 42)
		    {
		    System.out.println("The enetered bumber is : " + n); 
		    }
		 */

	/*	
		int n = 0;
		boolean flag = false;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numbers: ");
			n = sc.nextInt();
			if (n == 42)
				flag = true;
			if (!flag)
				System.out.println(n);
		}
*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 42) {
				break;
			} else {
				System.out.println(n);
			}
		}

	}

}
