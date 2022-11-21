package addd;

public class nestedloop {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++)//when i=1
		{
			for(int j=1;j<=4;j++) {
				System.out.println("i="+i+"j="+j);
			}
			
		}
		
		for(int i=1;i<=3;i++)//when i=1
		{
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//pattern
		System.out.println("Pattern");
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=4;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println("Triangle Pattern");	
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.println("Reverse Pattern");	
		for(int i=10;i>=1;i--) {
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}



