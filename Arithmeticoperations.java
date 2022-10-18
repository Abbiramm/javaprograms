package asdf;

public class Arithmeticoperations {
	public static void main(String args[])
	{
		float num1,num2,ans;
		num1=3.45f;
		num2=6.78f;
		
		//Addition
		ans=num1+num2;
		System.out.println("The sum of "+num1+"and"+num2+"is"+ans);
		
		
		//Subtraction
		ans=num1-num2;
		System.out.println("The difference of"+num1+"and"+num2+"is"+ans);
		
		//Multiplication
		ans=num1*num2;
		System.out.println("The multiplication of"+num1+"and"+num2+"is"+ans);
		
		
		//Quotient
		ans=num1/num2;
		System.out.println("The Quotient of"+num1+"and"+num2+"is"+ans);
		
		
		//Remainder
		ans=num1%num2;
		System.out.println("The Remainder of"+num1+"and"+num2+"is"+ans);
	}

}
