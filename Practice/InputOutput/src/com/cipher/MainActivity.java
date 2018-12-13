package com.cipher;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

		char numbers[] = {'1','2','3','4','5','6','7','8','9','0'};
		char symbols[] = {',','-','.',';','%','@','!','$'};
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		System.out.println("print the string "+str);
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
/*			char newCharValue = '0';
			if(ch[i] >= 'a' && ch[i] <='z'){
				newCharValue = (char)((int)ch[i] + n);
				System.out.println("New value is "+newCharValue);
			}
			else if(ch[i] >= 'A' && ch[i] <='Z'){
				newCharValue = (char)((int)ch[i] + n);
				System.out.println("New value is "+newCharValue);
			}
			
			else{
				newCharValue = ch[i];
			}*/
			int intValue = (int)(ch[i]);
			int newValue = 0;
			if(intValue >=65 && intValue <=90){
				if(intValue == 90)
				newValue = intValue+n;
			}
			
		}
		
	}

}
