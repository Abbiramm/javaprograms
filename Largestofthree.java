package arrays;

import java.util.Scanner;

class Large
{
	int a,b,c;
	void in() {
		
		Scanner sv=new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		a=sv.nextInt();
		b=sv.nextInt();
		c=sv.nextInt();
		
	}
	
	void out()
	{
		
		if(a>b && a>c)
			System.out.println(a+"is greater");
		else if(b>a && b>c)
			 System.out.println(b+"is greater");
		else
			System.out.println(c+"is greater");
		
		
	}
	
	
	
}



public class Largestofthree {
	public static void main(String[] args )
	{
		
		Large l=new Large();
		l.in();
		l.out();
		
		
		
	}

}
