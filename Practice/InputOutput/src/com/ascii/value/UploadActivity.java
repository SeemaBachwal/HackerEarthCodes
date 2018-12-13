package com.ascii.value;

import java.io.IOException;
import java.util.Scanner;

public class UploadActivity {
	
	public static void main(String[] args) throws IOException {
		/*

		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		//System.out.println("ASCII Value of char "+c+ " is "+ (int)c);
		System.out.println((int)c);
	*/
	char c = (char) System.in.read();
	System.out.println((int)c);
	}

}
