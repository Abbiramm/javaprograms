package addd;


class A
{  Sc
	
	void area(int i)
	{
		System.out.println("Area of square is:"+i*i);
	}
	void area(int l,int b)
	{
		
		System.out.println("Area of rectangle:"+l*b);
	}
	void area(float b,float h)
	{
		System.out.println("Area of triangle: "+0.5*b*h);
	}
	
	
	
	
}

public class ARea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A o=new A();
		o.area(5);
		o.area(5,6);
		o.area(2f,2f);

	}

}
