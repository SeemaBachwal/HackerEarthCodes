package com.anagrams;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 
public class MainActivity {
 
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
 
                for (int i = 0; i < a.length(); i++) {
                     if (!map1.containsKey(a.charAt(i)))
                           map1.put(a.charAt(i), count);
                     else
                           map1.put(a.charAt(i), map1.get(a.charAt(i)) + 1);
                }
 
                System.out.println("Key Value Pair for String a");
 
                for (Character c : map1.keySet()) {
                     System.out.println("Key  :  " + c + " Value  :  " + map1.get(c));
                }
 
                for (int j = 0; j < b.length(); j++) {
                     if (!map2.containsKey(b.charAt(j)))
                           map2.put(b.charAt(j), count);
                     else
                           map2.put(b.charAt(j), map2.get(b.charAt(j)) + 1);
                }
                System.out.println("Key Value Pair for String b");
 
                for (Character c : map2.keySet()) {
                     System.out.println("Key : " + c + "   Value : " + map2.get(c));
                }
 
                // Comparing maps keys
                for (Character map1Key : map1.keySet()) {
                     for (Character map2Key : map2.keySet()) {
                           if (!map1Key.equals(map2Key)) {
 
                                if (!arrayList.contains(map2Key)) {
                                     arrayList.add(map2Key);
                                }
                                else
                                {
                                     //arrayList.remove(map1Key);
                                     arrayList.remove(map2Key);
                                }
                                    
 
                           } else {
                                if (!arrayList.contains(map1Key)) {
                                     //arrayList.add(map1Key);
                                     arrayList.add(map2Key);
                                } else {
                                    // arrayList.remove(map1Key);
                                     arrayList.remove(map2Key);
                                }
 
                           }
 
                     }
                }
                System.out.println(arrayList);
 
                testCases--;
 
           }
 
           sc.close();
     }
 
}