package programs;
//Single Inheritance

//THIS SUPER

class Parentclass
{
	int i,j;
	Parentclass(int i,int j)
	{
		System.out.println("Parent class consntructor");
	this.i=i;
	this.j=j;
	}
	
}
class Childclass extends Parentclass
{
	int s;
Childclass(int i,int j)
{  super(i,j);
	System.out.println("Child constructor");
	
}
	void add()
	{
		
		s=i+j;
		System.out.println("The sum is "+s);
	}
	
	
	
}
public class superthis {

	public static void main(String[] args) {
		
		Childclass c=new Childclass(5,6);
		c.add();
		
		
		
		
		
	}

}
