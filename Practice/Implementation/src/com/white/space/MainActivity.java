package com.white.space;

import java.util.Scanner;

public class MainActivity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter=0;
		String str = sc.nextLine();
		char []ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if((int)ch[i] == 32){
				++counter;
			}
		}
		System.out.println(counter);
	}
}
