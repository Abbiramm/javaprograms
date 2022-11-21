package addd;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
	int i,num,cn=0;
	char t;
	Scanner c=new Scanner(System.in);
	while(true)
	{
	System.out.println("Enter the number");
	num=c.nextInt();
	
    for(i=1;i<=num;i++)
    {
    	
    	if(num%i==0)
    		cn=cn+1;
    		
    		
    }
	
	if(cn==2)
		System.out.println(num+" is  a prime number");
	else
		System.out.println(num+" is not a prime number");
	
	
	System.out.println("Enter n to exit and any other character to continue:");
	t=c.next().charAt(0);
	if(t=='n')
	{
		break;
	}
	}

}
}
