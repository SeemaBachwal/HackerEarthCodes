package com.easy.multiple;

import java.util.Scanner;

public class UploadActivity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int patternArr[] = {3,1,2,3,3,2,1};
		while (t != 0) {
			long n = sc.nextLong();
			long ans = 8;
			long i=6;
			while(i<n){
				ans = ans + i;
				for(int j=0; j<patternArr.length;j++){
					i=i+patternArr[j];
					break;
				}
			}
			//System.out.println(ans);
			//ans = BigInteger.ZERO;
			t--;
		}
		sc.close();
	
	}

}
