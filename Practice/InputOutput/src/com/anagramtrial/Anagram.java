package com.anagramtrial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	static int outcount=0;
	static ArrayList<Character> removeList = new ArrayList<Character>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map1 = null;
        HashMap<Character, Integer> map2 = null;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two strings a and b: ");
        //sc.nextLine();
        String a = sc.next();
        String b = sc.next();
        int count = 1;
        
        map1 = new HashMap<Character, Integer>();
        map2 = new HashMap<Character, Integer>();
        
        for (int i = 0; i < a.length(); i++) {
            if (!map1.containsKey(a.charAt(i)))
                  map1.put(a.charAt(i), count);
            else
                  map1.put(a.charAt(i), map1.get(a.charAt(i)) + 1);
       }
        for (int i = 0; i < b.length(); i++) {
            if (!map2.containsKey(b.charAt(i)))
                  map2.put(b.charAt(i), count);
            else
                  map2.put(b.charAt(i), map2.get(b.charAt(i)) + 1);
       }

       System.out.println("Key Value Pair for String a");

       for (Character c : map1.keySet()) {
            System.out.println("Key  :  " + c + " Value  :  " + map1.get(c));
       }
       System.out.println("Key Value Pair for String b");

       for (Character c : map2.keySet()) {
            System.out.println("Key  :  " + c + " Value  :  " + map2.get(c));
       }
       
       
       
       for (Character c : map1.keySet()) {
           if(map2.containsKey(c))
           {
        	   int diff=Math.abs((map1.get(c))-(map2.get(c)));
        	   if(diff > 0)
        	   {
        		   outcount+=1;
        		   removeList.add(c);
        		   
        	   }
           }
           else{
        	   outcount+=1;
        	   removeList.add(c);
           }
           System.out.println("output1: "+outcount);
           System.out.println("Removed List  after 1st for  "+removeList);
      } 

       for (Character c : map2.keySet()) {
    	   
    	   if(map1.containsKey(c))
    	   {
    	   	   if(removeList.contains(c))
    	   	   {
    	    	   removeList.add(c);
    	    	   outcount+=1;
    	   	   }

    	   }
    	   else{
    	   	   outcount+=1;
    	   	   removeList.add(c);   
    	   }
    	   
    	   /*
        	   if(!removeList.contains(c))
        	   {
            	   removeList.add(c);
            	   outcount+=1;
        	   }

           System.out.println("output2: "+outcount);
           System.out.println("Removed List after 2nd for "+removeList);
      */
    	   
       }
       
       System.out.println("Final outcount   : "+outcount);
       System.out.println("Final Removed List  "+removeList);
       

	}

}


/*       for (Character c : map2.keySet()) {
if(map1.containsKey(c))
{
	   if(!removeList.contains(c))
	   {
 	   removeList.add(c);
 	   outcount+=1;
	   }

//	   int diff=Math.abs((map1.get(c))-(map2.get(c)));
//	   if(diff > 0)
//	   {
//		   outcount+=1;
//		   map2.remove(c);
//	   }
}
else{
	   outcount+=1;
	   removeList.add(c);   
}

System.out.println("output2: "+outcount);
}*/

