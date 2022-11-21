//Exception 
public class except {

	public static void main(String[] args) {
		
		
		int a=10,b=20,c=0;
		
		System.out.println("BEfore divison");
		try {
		b=a/c;//error
	
		

	}
		
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
		}
		System.out.println("After division"+b);
		
		

}
}
