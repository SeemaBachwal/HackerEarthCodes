package com.string.madeof;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MainActivity {
	
	/* Using Enumeration
	 * enum Numbers { ZERO(6), ONE(2), TWO(5), THREE(5), FOUR(4), FIVE(5),
	 * SIX(6), SEVEN(3), EIGHT(7), NINE(6);
	 
	 * private int value;
	 * 
	 * private Numbers(int value) { this.value = value; } }
	
	 * for (Numbers n : Numbers.values())
	 * System.out.println(n+"  "+n.value+"  and the ordinal is  ");
	 */
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		Map<Character, Integer> numMap = new HashMap<Character, Integer>();
		numMap.put('0', 6);
		numMap.put('1', 2);
		numMap.put('2', 5);
		numMap.put('3', 5);
		numMap.put('4', 4);
		numMap.put('5', 5);
		numMap.put('6', 6);
		numMap.put('7', 3);
		numMap.put('8', 7);
		numMap.put('9', 6);
		
		int sum = 0;
		for (int i = 0; i < ch.length; i++) {
			if (numMap.containsKey(ch[i])) {
				sum = sum + numMap.get(ch[i]);
			}
		}
		System.out.println(sum);
	}
}