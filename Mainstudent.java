package arrays;

import java.util.Scanner;

class Student
{
	
	
	 int sid;
	 float sfees;
	 String sname;
	static String com;
	static {
		com="asdfasdf";
	}
	 
	 void in()
	 {
		 Scanner aa=new Scanner(System.in);
		System.out.println("Enter name:");
		sname=aa.next();
		System.out.println("Enter fees:");
		sfees=aa.nextFloat();
		System.out.println("Enter Id:");
		sid=aa.nextInt();
	 }
	void out()
	{
		System.out.println("Name:"+sname);
		System.out.println("Fees:"+sfees);
		System.out.println("Id:"+sid);
		System.out.println("Com:"+com);
		System.out.println();
	}
	
	
	
	
	
}
public class Mainstudent {
      public static void main(String args[])
      {
    	  Student s1=new Student();
    	  Student s2=new Student();
    	  s1.in();
    	 // s2.in();
    	  s1.out();
    	  //s2.out();
      }
}
