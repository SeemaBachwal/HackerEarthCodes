
package com.seating.arrangement;

import java.util.Scanner;

public class Upload {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
	
		/*	System.out.println("Enter total number of seats in one rack ");
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
		}*/
		
		System.out.println("Enter the test cases : ");
		int t = sc.nextInt();
		while(t!=0){
			System.out.println("\nEnter the seat number: " );
			int n = sc.nextInt();
			int d = n/12;
			int r = n%12;
			int a=0, b=0, c=0;
			if(d>0 || r!=0)
			{
				a = (12-r)+1;
				b = (12*d);
				c =a+b;
			}
			if(r==0)
			{
				a=0;
				b=(12*d)-(12-1);
				c=a+b;
			}
			if(c%6 ==0 || c%6 ==1)
				System.out.println(c +" WS");
			if(c%6 ==2 || c%6 ==5)
				System.out.println(c +" MS");
			if(c%6 ==3 || c%6 ==4)
				System.out.println(c +" AS");
			t--;
			//System.out.println("The value opposite to this is : " +c);
		}
		
		sc.close();
	
	
	}

}

