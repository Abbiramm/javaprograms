package arrays;

import java.util.Scanner;

class Grade 
{
	
	 int mark;
	 
	 void in()
	 { Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the mark:");
		 mark=sc.nextInt();		 
	 }
	 	 
	 void out()
	 {
		 if(mark>=90)
			 System.out.println("Grade A");
		 else if(mark>=80 && mark<90)
			 System.out.println("Grade B");
		 else if(mark>=70 && mark<80)
			 System.out.println("Grade C");
		 else if(mark>=60 && mark<70)
		      System.out.println("Grade D");	 
	 }
		
}
public class ifelseif {
	public static void main(String args[])
	{
		
		Grade g=new Grade();
		g.in();
		g.out();
		
		
	}
	
	   

}
