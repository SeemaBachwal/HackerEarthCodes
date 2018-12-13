package com.count.numbers;

import java.util.Scanner;

public class NewActivity {

	public static void main(String[] args) {
		int count = 0;
		boolean isNum = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases:");
		int t = sc.nextInt();
		while (t != 0) {
			System.out.println("Enter the length of the string");
			int n = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the String: ");
			String str = sc.nextLine();
			if (str.length() == n) {
				for (int i = 0; i < str.length(); i++) {
					if (((int) str.charAt(i) > 47 && (int) str.charAt(i) < 58)) {
						System.out.println("Printing the character  "+ str.charAt(i)+ "  and the ASCII code  "+(int)str.charAt(i));
						if (!isNum) {
							count++;
							isNum = true;
						}
					} else {
						isNum = false;
					}
				}

				// cnt = str.replaceAll("^\\D+|\\D+$", "").replaceAll("\\D+",
				// ",").split(",");
			}
			System.out.println("The count is : " + count);
			t--;
		}
		sc.close();
	}
}
