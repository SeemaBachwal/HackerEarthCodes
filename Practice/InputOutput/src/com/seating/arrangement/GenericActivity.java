package com.seating.arrangement;

import java.util.Scanner;

public class GenericActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of seats in one rack ");
		int s = sc.nextInt();
		System.out.println("\nEnter the number of racks : ");
		int loop = sc.nextInt();
		int x = (s/2), y=(s/2)+1;
		for(int i=1; i<=(s/2); i++){
		    int m = 0;
		    for(int l=0; l<loop; l++){
		        System.out.print((x+m)+"\t"+(y+m)+"\t|\t");
		        m+=s;
		    }
		    x--;
		    y++;
		    System.out.println("");
		}
		System.out.println("\nEnter the number: " );
		int n = sc.nextInt();
		int d = n/s;
		int r = n%s;
		int a=0, b=0, c=0;
		if(d>0 || r!=0)
		{
			a = (s-r)+1;
			b = (s*d);
			c =a+b;
		}
		if(r==0)
		{
			a=0;
			b=(s*d)-11;
			c=a+b;
		}
		
		System.out.println("The value opposite to this is : " +c);
		sc.close();
	}

}
