import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Data
{
	
	private String username;
	private String password;
	 public void in() throws IOException,NumberFormatException,NullPointerException
	 {
		 BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Usename:");
		username=b.readLine();
		System.out.println("Enter password:");
		password=b.readLine();
		
	 }
	public  void display() throws IOException,NumberFormatException,NullPointerException
	            
	 {  int i;        
		for(i=1;i<3;i++)
	      {
			  
		 if((username.equals("ABC"))&&(password.equals("ABC123")))
		 {
			 System.out.println("Valid user");
			    break;
		 }
		 else
		 {
			 System.out.println("NOt a valid user");
			 System.out.println("Try again");
			 System.out.println(3-i+"  Attempts left");
			  in();
			  
		 }
	 }
	 if(i>2)
	 {
		 System.out.println("Account is locked try after 24 hours. ");
		 
	 }
	
	
}
}



public class logpas {

	public static void main(String[] args) throws IOException,NumberFormatException,NullPointerException
	{
		// TODO Auto-generated method stub
		Data a=new Data();
		a.in();
		a.display();
		}

}
