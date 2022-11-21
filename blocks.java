package addd;

public class blocks {
		static{
			System.out.println("Static bolck");
		}
		{
			System.out.println("Empty block");
		}
		blocks()
		{
			System.out.println("Constructor");
		}
		void display()
		{
			
			System.out.println("Method display");
		}
		
		public static void main(String[] args) {
		System.out.println("Main Method");
		blocks b=new blocks();
		

	}

}
