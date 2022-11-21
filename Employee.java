package inputs;

import java.util.Scanner;

public class Employee {
	public static void main(String args[])
	{
		
		String ename,edept;
		int eage;
		float esalary;
		double eyearsalary;
		Scanner ac=new Scanner(System.in);
		
		System.out.println("Enter ename:");
		ename=ac.next();
		System.out.println("Enter age:");
		eage=ac.nextInt();
		System.out.println("Enter salary");
		esalary=ac.nextFloat();
		System.out.println("Enter department");
		edept=ac.next();
		
		
		System.out.println("Name:"+ename);
		System.out.println("Age:"+eage);
		System.out.println("Salary:"+esalary);
		System.out.println("Department:"+edept);
		eyearsalary=12*esalary;
		System.out.println("Yearsalary:"+eyearsalary);
		
		
		
	}

}
