package addd;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
	int i,num;
	Scanner c=new Scanner(System.in);
	System.out.println("Enter the number");
	num=c.nextInt();
    for(i=2;i<num;i++)
    {
    	
    	if(num%i==0)
    		System.out.println(i);
    		
    }
	
	
	
	}

}
