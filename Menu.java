package arrays;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n1,n2,c;
		Scanner s=new Scanner(System.in);
		System.out.println("----------MENU--------------");
		System.out.println("Enter choice:");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		c=s.nextInt();
		System.out.println("Enter 2 numbers");
		n1=s.nextInt();
		n2=s.nextInt();
		
		switch(c)
		{
		
		case 1:
			System.out.println("Addition of "+n1+" and "+n2+" is "+(n1+n2));
			break;
		case 2:
			System.out.println("Subtraction of "+n1+ "and "+n2+" is "+(n1-n2));
			break;
				
		case 3:
			System.out.println("Multiplication of "+n1+ " and "+n2+" is "+(n1*n2));
			break;
			
		case 4:
			if(n2!=0)
			System.out.println("Division of "+n1+" and "+n2+" is "+(n1/n2));
			else
				System.out.println("Division cannot be done");
			break;
			default:
				System.out.println("Invalid");
			
		
		
		}
		  
		
		
		
	}

}
