package add;

import java.util.Scanner;

class arm
{
	int t,n,rem,sum=0;
	
	
	void in()
	{
		
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter the number:");
	n=sc.nextInt();
	t=n;
	}
	
	void out()
	{
		
		while(n>0)
		{rem=n%10;
		 sum=sum+rem*rem*rem;	
		n=n/10;	
		}
		if(sum==t)
			System.out.println("Armstrong");
		else
			System.out.println("Not an armstrong");
	}
	
}

public class Armstrong {
	
	public static void main(String args[])
	{
		arm a=new arm();
		a.in();
		a.out();
		}

}
