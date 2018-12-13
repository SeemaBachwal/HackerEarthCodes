package com.seating.arrangement;

import java.util.Scanner;

public class WorkingActivity {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of racks : ");
		int rack = sc.nextInt();
		//int loop = 4;
		int x = 6, y=7;
		for(int i=1; i<=6; i++){
		    int m = 0;
		    for(int l=0; l<rack; l++){
		        System.out.print((x+m)+"\t"+(y+m)+"\t|\t");
		        m+=12;
		    }
		    x--;
		    y++;
		    System.out.println("");
		}
		
		System.out.println("\nEnter the number : " );
		int n = sc.nextInt();
		int d = n/12;
		int r = n%12;
		int a=0, b=0, c=0;
		if(d>0)
		{
			a = (12-r)+1;
			b = (12*d);
			c =a+b;
		}
		if(r==0)
		{
			a=0;
			b=(12*d)-11;
			c=a+b;
		}
		System.out.println("The value opposite to this is : " +c);
		sc.close();
		
	}
}
