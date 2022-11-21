package asdf;

import java.util.Scanner;

public class ww {
	
	
	public static void main(String args[])
	{
		int age;
		float fees;
		String name;
		char gen;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter name");
		name=in.nextLine();
		System.out.println("Enter age:");
		age=in.nextInt();
		System.out.println("Enter gender");
		gen=in.next().charAt(0);
		System.out.println("Enter Fees");
		fees=in.nextFloat();
		System.out.println("Age:"+age);
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gen);
		System.out.println("Fees:"+fees);
		
				
				
	}

}
