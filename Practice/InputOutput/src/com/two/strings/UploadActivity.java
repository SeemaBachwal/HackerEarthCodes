package com.two.strings;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UploadActivity {

	private static String sortStrings(char[] ch) {
		Arrays.sort(ch);
		String send = String.valueOf(ch);
		return send;
	}

	public static void main(String[] args) throws IOException {
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		sc.nextLine();
		while (testCases != 0) {
			String[] strArr = sc.nextLine().split(" ");
			if (strArr.length == 2) {
				str1 = strArr[0];
				str2 = strArr[1];
				if (str1.length() == str2.length()) {
					char ch1[] = str1.toCharArray();
					char ch2[] = str2.toCharArray();
					String str1Sort = sortStrings(ch1);
					String str2Sort = sortStrings(ch2);
					if (str1Sort.equals(str2Sort))
						System.out.println("YES");
					else
						System.out.println("NO");
				}
			}
			testCases--;
		}
	}
}
