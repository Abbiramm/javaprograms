import java.util.Scanner;

public class Excephomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int withdraw=4000,totalamount; 
          Scanner c=new Scanner(System.in);
          System.out.println("Enter the amount to withdraw:");
          totalamount=c.nextInt();
          try
          {
        	  if(withdraw<totalamount) throw new ArithmeticException("Withdraw amount is higher than the original amount");
          }
          catch(Exception d)
          {
        	  d.printStackTrace();
          }
          
	}

}
