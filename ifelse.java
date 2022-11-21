package arrays;

import java.util.Scanner;

public class ifelse {
	
	public static void main(String arfs[])
	{
		int a;
		
	Scanner cv=new Scanner(System.in);
	
	System.out.println("Enter the number:");
	a=cv.nextInt();
	//Zero or not
	if(a==0)
		System.out.println("The number is zero");
	else
		System.out.println("The number is not zero");
	//Positive or negative
	if(a>0)
		System.out.println("The number is positive");
	else
		System.out.println("The number is negative");
	//Odd or Even
	if(a%2==0)
		System.out.println("The number is even");
	else
		System.out.println("The number is odd");
	}

}
