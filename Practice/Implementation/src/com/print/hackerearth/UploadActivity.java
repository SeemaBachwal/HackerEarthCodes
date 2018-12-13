package com.print.hackerearth;

import java.util.HashMap;
import java.util.Scanner;

public class UploadActivity {
	
	static HashMap<Character,Integer> map = null;
	
	private static int findAEHRValues(char ch) {
		char chIn = ch;

		// For characters a, e, h and r
		int diff= map.get(chIn), counter = 0;
		while(diff>=2){
			System.out.println("Number is "+diff);
			++counter;
			diff = diff - 2;
				map.put(chIn, diff);
				System.out.println("Counter is "+counter);
		}
	
		return counter;
	}
	
	private static int findCKTValues(char ch) {
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		if(n==str.length()){
			char []chArr = str.toCharArray();
			map = new HashMap<Character, Integer>();
			int charCount = 1;
			for (int i = 0; i < chArr.length; i++) {
				if(chArr[i]=='a' || chArr[i]=='e' || chArr[i]=='h' || chArr[i]=='r' || chArr[i]=='c' || chArr[i]=='k' || chArr[i]=='t')
				{
					if(!map.containsKey(chArr[i]))
						map.put(chArr[i], charCount);
					else
						map.put(chArr[i], map.get(chArr[i])+1);
				}
			}
			
			//Print Map
			for (char ch : map.keySet()) {
				System.out.println("Key  "+ch+"  Value  "+map.get(ch));
				int a=0,e=0,h=0,r=0,c=0,k=0,t=0;
				if(ch == 'a'){
					a = findAEHRValues(ch);
				}
				else if(ch == 'e'){
					e = findAEHRValues(ch);
				}
				else if(ch == 'h'){
					h = findAEHRValues(ch);
				}
				else if(ch == 'r'){
					r = findAEHRValues(ch);
				}
				else if(ch == 'c'){
					c = findCKTValues(ch);
				}
				else if(ch == 'k'){
					k = findCKTValues(ch);
				}
				else if(ch == 't'){
					t = findCKTValues(ch);
				}
			}
			
			
/*			for (char c : map.keySet()) {
				if(c == 'a' || c == 'e' || c == 'h' || c == 'r')
				{
					// For characters a, e, h and r
					int diff= map.get(c), counter = 0;
					 while(diff>2){
						System.out.println("Number is "+diff);
						diff = diff - 2;
						if(diff % 2 ==0 ||  diff>=2){
							map.put(c, diff);
							++counter;
							System.out.println("Counter is "+counter);
						}
					}
					while(diff>=2){
						//System.out.println("Number is "+diff);
						++counter;
						diff = diff - 2;
							map.put(c, diff);
							System.out.println("Counter is "+counter);
					}
					continue;
				}
				else
				{
					// For characters c, k and t
					System.out.println("Character is c k or t");
					continue;
				}
			}*/
		}
	}
}