package com.roy.profilepic;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class ProfilePic {
	static Scanner sc = new Scanner(System.in);
	static int l;
	
	public static void main(String[] args) {
		System.out.println("Enter length of sqaure: ");
		 l = sc.nextInt();
		
		
		//int w=0, h=0;
		
		//System.out.println("Enter Number of photos Roy has: ");
		System.out.println("Enter no of samples");
		
		int n = sc.nextInt();
		 sc.nextLine();
		
		for(int i=1;i<=n;i++)
		{
			defineResults();
		}
		
	      

	   
	}

	
	
	private static void defineResults() {
		// TODO Auto-generated method stub
		int w=0, h=0;
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		      
		         str = sc.nextLine();
		         
		         String[] split = str.split(" ");
		        
		          w = Integer.parseInt(split[0]);
	              h = Integer.parseInt(split[1]);
		        
	            /*if(split.length == 2)
		        {
		            w = Integer.parseInt(split[0]);
		            h = Integer.parseInt(split[1]);
		        }

		      } catch (IOException ioe) {
		         System.out.println(ioe);
		      }*/
			    System.out.println(w+"\t"+h);

			//int dimensionl = l*l;
			//int dimensionwh = w*h;
			
			
		/*if(w<l || h<l)
				System.out.println("Upload Another");
			else if(w==h || (w>l && h>l) && n<dimensionwh)
				System.out.println("Accepted");
			else
				System.out.println("Crop it");*/
			
			/* if (w[i]<l || h[i]<l)
	    		  System.out.println("UPLOAD ANOTHER");
	    	  else if(w[i]>=l && h[i]>=l) 
	    	     {if(w[i]==h[i])
	    	      System.out.println("ACCEPTED");
	    	     else System.out.println("CROP IT");*/
			
			if(w<l || h<l)
				//System.out.println("Upload Another");
				System.out.println("UPLOAD ANOTHER");
			
		//	if(w>=l && h>=l && (n<dimensionwh))
			else if(w>=l && h>=l )
			{
				if(w==h)
				{
					//System.out.println("Accepted");
					System.out.println("ACCEPTED");
				}
				else
				{  //System.out.println("Crop it");
					System.out.println("CROP IT");
				}
				
			}
		
		      }

}


