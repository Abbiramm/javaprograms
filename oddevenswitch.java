package arrays;

import java.util.Scanner;

public class oddevenswitch {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
         System.out.println("Enter the number:");
         n=s.nextInt();
         switch(n%2)
         {
         
         case 0:
        	 System.out.println("Even");
        	 break;
         case 1:
        	 System.out.println("Odd");
        	 break;
         
         
         }
         
         
	}

}
