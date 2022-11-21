package arrays;

import java.util.Scanner;

class Eemployee
{
	int eid;
	String ename;
	float esalary;
	String edept;
	
	
	void inputData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		 ename=sc.next();
		System.out.println("Enter employee id:");
		eid=sc.nextInt();
		System.out.println("Enter Employee salary:");
		esalary=sc.nextFloat();
		System.out.println("Enter deptartment:");
		edept=sc.next();
		
		
	}
	void output()
	
	{
	   System.out.println("Name:"+ename);
	   System.out.println("Emp Id:"+eid);
	   System.out.println("emp salary:"+esalary);
	   System.out.println("dept:"+edept);
	   System.out.println();
	   
	}
	
	
	
}





public class mainprg {
            public static void main(String args[])
            {
            	Eemployee e1=new Eemployee();
            	Eemployee e2=new Eemployee();
            	Eemployee e3=new Eemployee();
              
            	e1.inputData();
            	e2.inputData();
            	e3.inputData();
            	
            	
            	e1.output();
            	e2.output();
            	e3.output();
            	
            	
            	
            }
            
}
