package arrays;

import java.util.Scanner;

public class Largeoftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ac=new Scanner(System.in);
		int a,b;
		
		System.out.println("Enter the number1:");
		a=ac.nextInt();
		System.out.println("Enter the number2:");
		b=ac.nextInt();
		
		if(a>b)
			System.out.println(a+"is greater");
		else
			System.out.println(b+"is greater");
	}

}
