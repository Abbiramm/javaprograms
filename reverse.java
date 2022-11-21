package addd;

import java.util.Scanner;

class number
{  int n,t,rev=0;
	void in()
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the number");
		n=sc.nextInt();
		t=n;
		
	}
	void rev()
	{
		int rem;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse is "+rev);
	}
		void palindrome()
		{
			
			if(t==rev)
				System.out.println(t+" is a Palindrome");
			else
				System.out.println(t+" is Not a palindrome");
			
		}
	}
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		number nn=new number();
		nn.in();
		nn.rev();
		nn.palindrome();
		}

}
