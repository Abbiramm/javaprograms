package pattern;

import java.util.Scanner;

public class pat5 {
	
	public static void main(String[] args) 
	{
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter the limit");
			int n=in.nextInt();
			for(int i=1;i<=n;i++)
			{
			    for(int j=n;j>i;j--)
			    {
			        System.out.print(" ");
			    }
			    for(int j=1;j<=i;j++)
			    {
			        System.out.print("* ");
			    }
			    System.out.println();
			}
			for(int i=n-1;i>=1;i--)
			{
			    for(int j=n;j>i;j--)
			    {
			        System.out.print(" ");
			    }
			    for(int j=1;j<=i;j++)
			    {
			        System.out.print("* ");
			    }
			    System.out.println();
			}
	}


}
