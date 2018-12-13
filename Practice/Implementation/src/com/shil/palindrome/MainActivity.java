package com.shil.palindrome;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainActivity {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		char ch[] = str.toCharArray();
		int charcount=1;
		//logic for character count
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		for (int i = 0; i < ch.length; i++) {
			if(!map.containsKey(ch[i]))
			{
				map.put(ch[i], charcount);
			}
			else
			{
				map.put(ch[i], map.get(ch[i])+1);
			}
			
		}
		
		//is not a Palindrome logic
		/*for (Map.Entry<Character, Integer> e : map.entrySet()) {
			//System.out.println("Key : "+e.getKey()+ " Value : "+e.getValue());
			if(e.getValue()%2!=0){
				//evennumberedchar.add(e.getKey());
				ch[(ch.length/2)] = e.getKey();
				map.put(e.getKey(), e.getValue()-1);
				//System.out.println("----"+e.getKey()+"mid character ");
			}
			
		}*/
		
		
		//Even Odd Logic
		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			//System.out.println("Key : "+e.getKey()+ " Value : "+e.getValue());
			if(e.getValue()%2!=0){
				ch[(ch.length/2)] = e.getKey();
				map.put(e.getKey(), e.getValue()-1);
				//System.out.println("----"+e.getKey()+"mid character ");
			}
			
		}
		
		int i = 0,j = ch.length-1;
		for (Map.Entry<Character, Integer> e : map.entrySet()) {

			while(e.getValue()!=0)
			{
				ch[i] = e.getKey();
				ch[j] = e.getKey();
				System.out.print(ch[i]+"----"+ch[j]);
				map.put(e.getKey(),e.getValue()-2);
				i++;
				j--;
			}
		}
		System.out.println("Palindrome String is");
		for (int k = 0; k < ch.length; k++) {
			
			System.out.print(ch[k]);
		}
	sc.close();	
	}

}
