package com.good.string;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainActivity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char []ch = str.toCharArray();
		int charcount=1;
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
		int sum = 0,removeCount;
		for (char c : map.keySet()) {
			removeCount = map.get(c)-1;
			if(removeCount==0){
				continue;
			}
			else{
				sum = sum +removeCount;
			}
		}
		 System.out.println(sum);
	}
}