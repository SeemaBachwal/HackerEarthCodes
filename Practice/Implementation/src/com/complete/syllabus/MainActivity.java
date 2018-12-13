package com.complete.syllabus;

import java.util.Scanner;

public class MainActivity {
	
	static int itr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		String []daysArr = {"MONDAY","TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
		while(test!=0){
			int sum =0;
			int numOfTopics = sc.nextInt();
			int []topicsArr = new int[7];
			System.out.println("Input Array");
			for (int i = 0; i < topicsArr.length; i++) {
				topicsArr[i] = sc.nextInt();
				sum = sum + topicsArr[i];
			}
			int diff = numOfTopics-sum;
			
			while(diff!=0){	
				if(itr<topicsArr.length){
					diff = diff - topicsArr[itr];
					System.out.println("now the diff is --- "+diff);	
				}
				itr++;
				System.out.println("Value of i ---- "+itr);
			}
			System.out.println("Print the day "+daysArr[itr]);
			
/*			while(diff!=0){
				for (int i = 0; i < topicsArr.length; i++) {
					if(topicsArr[i]==0)
						continue;
					diff = diff - topicsArr[i];
				}
				continue;
			}*/
			
			//System.out.println("The sum is "+sum);
		}
	}
}
