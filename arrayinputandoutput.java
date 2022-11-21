package addd;

import java.util.Scanner;

public class arrayinputandoutput {
   public static void main(String args[])
   {
	   int a[]=new int[8];
	   int i,s=0;
	   float avg;
	   Scanner cc=new Scanner(System.in);
	   for(i=0;i<a.length;i++)
	   {
		   a[i]=cc.nextInt();
		   
	   }
	   //display all the elements
	   System.out.println("Array elements");
	   for(i=0;i<a.length;i++)
	   {
		   System.out.println(a[i]);
		   
	   }
	   
	   //sum
	   for(i=0;i<a.length;i++)
	   {
		  s=s+a[i];
		   
	   }
	   System.out.println("Sum="+s);
	   
	   //average
	   
	   avg=(float)s/a.length;
	   System.out.println("Average="+avg);  
	   
	   int max=a[0];
	   for(i=1;i<a.length;i++)
	   {
		   if(a[i]>max)
		   {
			   max=a[i];
		   }
	   }
	   
	   System.out.println("Maximum of all arrays is "+max);
	   

	   int min=a[0];
	   for(i=1;i<a.length;i++)
	   {
		   if(a[i]<min)
		   {
			   min=a[i];
		   }
	   }
	   
	   System.out.println("Minimum of all arrays is "+min);
	   
	   System.out.println("Reverse");
	   for(i=a.length-1;i>=0;i--)
	   {
		   System.out.println(a[i]);
	   }
	   
	   
   }
}
