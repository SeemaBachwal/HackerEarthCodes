package com.presidential.problem;

import java.util.Scanner;

public class NewActivity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = 0, r = 0, newVal = 0, n = 0, q = 0;
		char newChar = '0';
		char []ch = null;
		System.out.println("Enter number of test cases: ");
		int t = sc.nextInt();
		System.out.println("Enter the number of queries and string length");
		sc.nextLine();
		String s = null;
		s = sc.nextLine();
		String[] ss = s.split(" ");
		if (ss.length == 2) {
			q = Integer.parseInt(ss[0]);
			n = Integer.parseInt(ss[1]);
		}
		
		System.out.println("Enter the String");
		String A = sc.next().toLowerCase();
		if(A.length()==n){
			sc.nextLine();

			ch = A.toCharArray();
			System.out.println(ch);

			while (q != 0) {
				System.out.println("Enter the cyclic range L and R:");
				String str = null;

				str = sc.nextLine();
				String[] split2 = str.split(" ");
				if (split2.length == 2) {
					l = Integer.parseInt(split2[0])-1;
					r = Integer.parseInt(split2[1])-1;
				}

				if (l < ch.length && r < ch.length) {
					for (int i = l; i <= r; i++) {

						// One letter Decremented
						newVal = ((int) ch[i] - 1);
						if (newVal == 96)
							newVal = newVal + 26;
						newChar = (char) (newVal);
						ch[i] = newChar;

					}
				}

				q--;
			}	
		}
		

		System.out.println("The new String formed before cyclic shift\t"+A);
		String B = new String(ch);
		System.out.println("The new String formed after cyclic shift \t"+B);

		sc.close();

	
	}

}
