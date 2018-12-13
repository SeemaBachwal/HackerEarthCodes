package com.seating.arrangement;

import java.util.Scanner;

public class MainActivity {
	
	public static void main(String[] args) {
		/*int count =6;
		int arr[][] = new int[6][1];
		
 		for(int i=5; i>=0; i--){
			
			for (int j=0; j<1;j++) {
				
				arr[i][j]=count--;
				
				System.out.print(arr[i][j]);
			}
			
			System.out.println();
		}*/
		
		/*int count =6,i,j;
		int countt=6;
		int a[][] = new int[6][2];
		
 		for(i=5; i>=0; i--){
			
			for (j=0; j<1;j++) {
				
				arr[i][j]=count--;
				
				System.out.print(a[i][j]);
			}
			j++;
			a[i][j]=++countt;
			
			System.out.println();
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of racks : ");
		int loop = sc.nextInt();
		//int loop = 4;
		int x = 6, y=7;
		for(int i=1; i<=6; i++){
		    int m = 0;
		    for(int l=0; l<loop; l++){
		        System.out.print((x+m)+"\t"+(y+m)+"\t");
		        m+=12;
		    }
		    x--;
		    y++;
		    System.out.println("\n");
		}
		
		System.out.println("Enter the number : " );
	
		int n = sc.nextInt();
		
		int d = n/12;
		int r = n%12;
		int a=0, b=0, c=0;
		
		if(d>0)
		{
			a = (12-r)+1;
			b = (12*d);
			c =a+b;
		}
		if(r==0)
		{
			a=0;
			b=(12*d)-11;
			c=a+b;
		}
		
		System.out.println("The value opposite to this is : " +c);
		
		
		System.out.println("\n\n");
	
	}
	
}
