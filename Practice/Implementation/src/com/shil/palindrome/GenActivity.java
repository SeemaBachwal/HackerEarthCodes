package com.shil.palindrome;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GenActivity {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next().toLowerCase();
		char ch[] = str.toCharArray();
		int charcount=1;char chpal='\0';
		LinkedList<Character> evennumberedchar = new LinkedList<Character>();
		LinkedList<Character> oddnumberedchar = new LinkedList<Character>();
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
		
		//Even Odd Logic
		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			//System.out.println("Key : "+e.getKey()+ " Value : "+e.getValue());
			if(e.getValue()%2!=0){
				//evennumberedchar.add(e.getKey());
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
				map.put(e.getKey(),e.getValue()-2);
				i++;
				j--;
			}
		}
		
		for (int k = 0; k < ch.length; k++) {
			
			System.out.print(ch[k]);
		}
		
		/*System.out.println(evennumberedchar);
		System.out.println(oddnumberedchar);
		
		int len = ch.length;
		System.out.println("Length "+len);
		int mid = len/2;
		System.out.println("Mid "+mid);
		//System.out.println("elemnet " +oddnumberedchar.element());
		ch[mid] = oddnumberedchar.element();
		System.out.println("Middle Character : "+ch[mid]);
		
		int size = oddnumberedchar.size();
		while(size>1)
		{
			size = size-2;
			ch[size] = oddnumberedchar.element();
			
		}
		
			for (Character echaracter : evennumberedchar) {
				//System.out.println("echar "+echaracter);
				for (int i = 0; i < len-1; i=i+2) {
					
					ch[i] = echaracter;
					ch[len-1] = echaracter;
					len=len-2;
				}
			}
		System.out.println("Palindrome formed");
			for (int i = 0; i < ch.length; i++) {
				System.out.print(ch[i]);
			}*/
		

	/*	
		System.out.println("Even characters separated ");
		Iterator<Character> itreven = evennumberedchar.iterator();
		while (itreven.hasNext()) {
			System.out.println(itreven.next()+"\t");
			
		}
		System.out.println("Odd characters separated ");
		Iterator<Character> itrodd = evennumberedchar.iterator();
		while (itrodd.hasNext()) {
			System.out.println(itrodd.next()+"\t");
			
		}*/
	/*
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next().toLowerCase();
		char ch[] = str.toCharArray();
		int charcount=1;
		ArrayList<Character> evennumberedchar = new ArrayList<Character>();
		ArrayList<Character> oddnumberedchar = new ArrayList<Character>();
		//logic for character count
		Map<Character,Integer> map = new HashMap<Character,Integer>();
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
		
		//Even Odd Logic
		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			System.out.println("Key : "+e.getKey()+ " Value : "+e.getValue());
			if(e.getValue()%2==0){
				evennumberedchar.add(e.getKey());
			}
			else{
				oddnumberedchar.add(e.getKey());
				
			}
			
			
			
		}
		System.out.println(evennumberedchar);
		System.out.println(oddnumberedchar);
		
		//sorting Logic
		
		
		
		
		System.out.println("Even characters separated ");
		Iterator<Character> itreven = evennumberedchar.iterator();
		while (itreven.hasNext()) {
			System.out.println(itreven.next()+"\t");
			
		}
		System.out.println("Odd characters separated ");
		Iterator<Character> itrodd = evennumberedchar.iterator();
		while (itrodd.hasNext()) {
			System.out.println(itrodd.next()+"\t");
			
		}
	*/
	sc.close();	
	}

}
