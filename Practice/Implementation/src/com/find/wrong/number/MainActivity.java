package com.find.wrong.number;
import java.util.Scanner;
public class MainActivity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strTest = sc.nextLine();
		int t = Integer.parseInt(strTest);
		//int t = sc.nextInt();
		int u = 0, v = 0;
		//sc.nextLine();
		while(t!=0){
			//String str = sc.nextLine();
			//int n = Integer.parseInt(str);
			int n =  sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0 ; i < n; i++) {
				//String arrStr = sc.nextLine();
				//arr[i] = Integer.parseInt(arrStr);
				arr[i] = sc.nextInt();
			}
			if(arr[0]!=0){
				System.out.println("Incorrect "+arr[0]);
				continue;
			}
			if(arr[1]==2){
				v=2;
				u=1;
			}
			else if(arr[1]==4)
			{
				v = 3;
				u = 2;
			}
			else if(arr[1]==6)
			{
				v = 3;
				u = 1;
			}
			else if(arr[1]==8)
			{
				v = 4;
				u = 3;
			}
			else if(arr[1]==12)
			{
				v = 4;
				u = 2;
			}
			else if(arr[1]==14)
			{
				v = 4;
				u = 1;
			}
			else{
				System.out.println("Incorrect "+arr[1]);
				continue;
			}
			for (int i = 2; i < arr.length; i++) {
				if(arr[i] == ((int)Math.pow(i+1, v) - (int)Math.pow(i+1, u))){
					if(i==(n-1))
						System.out.println("Correct");
					else
						continue;
				}
				else{
					System.out.println("Incorrect "+arr[i]);
					break;
				}
			}
			t--;
		}
	}
}