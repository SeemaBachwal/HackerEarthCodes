package com.roy.profilepic;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		int w = 0, h = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of sqaure: ");
		int l = sc.nextInt();
		System.out.println("Enter Number of photos Roy has: ");
		int n = sc.nextInt();
		sc.nextLine();
		while(n!=0){
			System.out.print("Enter the values for width and height");

			String str = null;
			str = sc.nextLine();
			String[] split = str.split(" ");
			if (split.length == 2) {
				w = Integer.parseInt(split[0]);
				h = Integer.parseInt(split[1]);
			}

			System.out.println(w + "\t" + h);

			if (w < l || h < l)
				System.out.println("UPLOAD ANOTHER");
			else if (w >= l && h >= l) {
				if (w == h) {
					System.out.println("ACCEPTED");
				} else {
					System.out.println("CROP IT");
				}

			}	
		}
		
		sc.close();
	}

}
