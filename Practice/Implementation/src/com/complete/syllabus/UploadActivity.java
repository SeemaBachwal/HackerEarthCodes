package com.complete.syllabus;

import java.util.Scanner;

public class UploadActivity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		String[] daysArr = { "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
				"FRIDAY", "SATURDAY", "SUNDAY" };
		while (test != 0) {
			int sum = 0;
			int numOfTopics = sc.nextInt();
			int[] topicsArr = new int[7];
			for (int i = 0; i < topicsArr.length; i++) {
				topicsArr[i] = sc.nextInt();
				sum = sum + topicsArr[i];
			}
			int rem = numOfTopics % sum;
			//System.out.println("Rem after mod function -- " + rem);
			if (rem == 0) {
				for (int i = topicsArr.length-1 ; i >= 0; i--) {
					if(topicsArr[i]==0)
						continue;
					else{
						//System.out.println("Last Day always " + daysArr[i]);
						System.out.println(daysArr[i]);
						break;
					}
				}
			}
			else {
				for (int i = 0; i < topicsArr.length; i++) {
					rem = rem - topicsArr[i];
					if (rem == 0 || rem < 0) {
						//System.out.println("Day when syllabus is completed  "+ daysArr[i]);
						System.out.println(daysArr[i]);
						break;
					} else {
						continue;
					}
				}
			}
			test--;
		}
	}
}
