
public class Except3 {

	public static void main(String[] args) {
		int a=10,b=2,c=0;
		int ar[]=new int[4];
		System.out.println("Before division");
		System.out.println("Array assignment");
		try {
		b=a/c;
		ar[5]=90;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("After division");
		System.out.println("after array assignment");
		
		//OR
		try {
			
			ar[5]=90;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			System.out.println("After division");
			System.out.println("after array assignment");
			
			try {
				
				b=a/c;
				}
				catch(ArithmeticException e) {
					e.printStackTrace();
				}
				System.out.println("After division");
				System.out.println("after array assignment");
			
		
		
	}

}
