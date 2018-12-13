package com.magical.word;


import java.util.Scanner;

public class MainActivity {

	/*
	public static boolean isPrime(int number){
		
		for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
		}
		return true;		
	}*/
	
	public static boolean isPrime(int number){
		
		for(int i=2; i<=Math.sqrt(number); i++){
			   if(number % i == 0){
                return false;
            }
		}
		return true;		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter any String : ");
		String str = sc.next();
		
		char ch [] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println(ch[i]+"\t"+(int)ch[i]);
			
			if( (ch[i]>=65) && (ch[i]<=90))
			{
				if(isPrime(ch[i]))
					System.out.println("The numer is Prime\n");
				else
					System.out.println("The number is not Prime\n");
					
			}
			
			if( (ch[i]>=97) && (ch[i]<=122))
			{
				if(isPrime(ch[i]))
					System.out.println("The numer is Prime\n");
				else
					System.out.println("The number is not Prime\n");
			}
			
		}

	}

}
