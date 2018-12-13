package com.print.hackerearth;

import java.util.Scanner;
public class SimpleActivity {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		if(n==str.length()){
			char []chArr = str.toCharArray();
			int a=0,e=0,h=0,r=0,c=0,k=0,t=0; int counter = 0;
			for (char ch : chArr) {
				if(ch == 'a')
					a++;
				else if(ch == 'e')
					e++;
				else if(ch == 'h')
					h++;
				else if(ch == 'r')
					r++;
				else if(ch == 'c')
					c++;
				else if(ch == 'k')
					k++;
				else if(ch == 't')
					t++;
			}
			//System.out.println("Values a : "+a+"  e : "+e+"  h : "+h+"  r : "+r+"  c : "+c+"  k : "+k+"  t : "+t);
				while(a>=2 && e>=2 && h>=2 && r>=2 && c>=1 && k>=1 && t>=1){
					a=a-2;
					e=e-2;
					h=h-2;
					r=r-2;
					c--;
					k--;
					t--;
					counter++;
				}
			//System.out.println("Print Hackerearth Count  "+counter);
			System.out.println(counter);
		}
	}
}