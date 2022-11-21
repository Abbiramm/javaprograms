
public class except2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		System.out.println("Before printing");
		try {
		a[0]=2;
		a[1]=3;
		a[2]=4;
		a[3]=5;
		a[4]=6;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("After printing");
	}

}
