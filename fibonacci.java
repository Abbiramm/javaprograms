package arrays;

import java.util.Scanner;

public class fibonacci {
	public static void main(String s[])
	{
		
		int f1,f2,f3,n=1,t;
		Scanner c=new Scanner(System.in);
		f1=1;
		f2=1;
		System.out.println("Enter the number");
		t=c.nextInt();
		System.out.println(f1);
		System.out.println(f2);
		
		while(n<t)
		{
		f3=f1+f2;	
		f1=f2;
		f2=f3;
		System.out.println(f3);	
		n++;
		
		}
			
			
		
		
		
		
		
	}
}


