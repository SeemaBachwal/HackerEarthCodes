package com.prime;

import java.util.Scanner;

public class MainActivity {	
	
	public static void main(String[] args) {
		int n = 0,count=0;
		
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the max range to find prime values : ");
		n = sc.nextInt();
		for(int i = 2; i < n; i++){
			boolean isPrime=true;	
			for (int j = 2; j < i; j++) {
				
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				count++;
				//System.out.print(i+"\t");
				System.out.print(i);
			}
			
		}
		//System.out.println("\nThe total count of prime numbers in given range "+n+" are "+count);
		System.out.println(count);
		
		sc.close();
	}
	
}
