import java.util.Scanner;

public class Excep6 {
	public static void main(String args[])
	{
		
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age ");
		age=sc.nextInt();
		try {
			if(age<18) throw new ArithmeticException("Not eligible for voting");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}

	}



		
	}


