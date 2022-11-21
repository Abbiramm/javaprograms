package programs;
//Single Inheritance

class Parent
{
	int i,j;
	Parent()
	{
		System.out.println("Parent class consntructor");
	i=10;
	j=20;
	}
	
}
class Child extends Parent
{int s;
	void add()
	{
		
		s=i+j;
		System.out.println("The sum is "+s);
	}
	
	
	
}
public class Singleinheritance {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.add();
		
		
		
		
		
	}

}
