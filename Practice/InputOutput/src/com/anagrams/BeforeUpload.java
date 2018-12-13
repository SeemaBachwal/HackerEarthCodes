package com.anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BeforeUpload {

	public static void main(String[] args) {


		HashMap<Character, Integer> map1 = null;
		HashMap<Character, Integer> map2 = null;
		ArrayList<Character> arrayList = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of testcases ");
		int testCases = sc.nextInt();
		int count = 1;
		while (testCases > 0) {
			System.out.println("Enter the two strings a and b: ");
			sc.nextLine();
			String a = sc.next();
			String b = sc.next();
			map1 = new HashMap<Character, Integer>();
			map2 = new HashMap<Character, Integer>();
			arrayList = new ArrayList<Character>();

			int map1KeyCount;
			for (int i = 0; i < a.length(); i++) {
				if (!map1.containsKey(a.charAt(i)))
					map1.put(a.charAt(i), count);
				else
					map1.put(a.charAt(i), map1.get(a.charAt(i)) + 1);
			}

			for (int j = 0; j < b.length(); j++) {
				if (!map2.containsKey(b.charAt(j)))
					map2.put(b.charAt(j), count);
				else
					map2.put(b.charAt(j), map2.get(b.charAt(j)) + 1);
			}

			for (Character map1Key : map1.keySet()) {
				if (map2.containsKey(map1Key)) {
					int absDiff = Math.abs(map1.get(map1Key)
							- map2.get(map1Key));
					while (absDiff != 0) {

						arrayList.add(map1Key);
						absDiff--;
					} 
				} else {
					map1KeyCount = map1.get(map1Key);
					while (map1KeyCount != 0) {
						arrayList.add(map1Key);
						map1KeyCount--;
					}
				}
			}

			for (Character map2Key : map2.keySet()) {
				int map2KeyCount;
				if (!arrayList.contains(map2Key) && !map1.containsKey(map2Key)) {
					map2KeyCount = map2.get(map2Key);
					while (map2KeyCount != 0) {
						arrayList.add(map2Key);
						map2KeyCount--;
					}
				}
			}
			System.out.println("Character removed list  " + arrayList + " and total deletions are : " + arrayList.size());
			testCases--;
		}
		sc.close();
	
		
	}

}
