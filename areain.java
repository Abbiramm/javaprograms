package inputs;

import java.util.Scanner;

public class areain {
	public static void main(String args[])
	{
		int l,b,s,l1,b1,r;
		
		Scanner sc=new Scanner(System.in);
		
		//Rectangle
		System.out.println("Enter length:");
		l=sc.nextInt();
		System.out.println("Enter breadth:");
		b=sc.nextInt();
		System.out.println("Area of rectangle:"+(l*b));
		
		
		//Square
		System.out.println("Enter side:");
		s=sc.nextInt();
		System.out.println("Area of square:"+(s*s));
		
		//Triangle
		System.out.println("Enter length:");
		l1=sc.nextInt();
		System.out.println("Enter breadth:");
		b1=sc.nextInt();
		System.out.println("Area of Triangle:"+(0.5*l1*b1));
		
		//Circle
		System.out.println("Enter radius:");
		r=sc.nextInt();
		System.out.println("Area of circle:"+(3.14*r*r));
		
		
		
		
		
		
		
	}

}
