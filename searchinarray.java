package addd;

import java.util.Scanner;

public class searchinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[6];
		int i,pos=0;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=c.nextInt();
		}
		System.out.println("Enter the number to be searched:");
		int n;
		n=c.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{ pos=i+1;
				break;
				
			}
		}
		if(pos>0)
		{
			System.out.println("successful search");
		System.out.println(n+" is present at position "+pos);
	
		}
		else
		{
			System.out.println("unsuccessful search");	
		}


	}

}
