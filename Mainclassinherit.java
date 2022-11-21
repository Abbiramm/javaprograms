package Main;


import anotherpack.Parent;
class Childclass extends Parent
{
	int s;
Childclass(int i,int j)
{   super(i,j);
	System.out.println("Child constructor");
	
}
	void add()
	{
		
		s=i+j;
		System.out.println("The sum is "+s);
	}
	
	
	
}
public class Mainclassinherit {

	public static void main(String[] args) {
		
		Childclass c=new Childclass(5,6);
		c.add();
		//System.out.println("print i from Parent:"+c.i);this shows error because 'i' is proteceted.
		System.out.println("Print m from parent:"+c.m);//this does not shows any errors because m is public.
		
		
		
		
	}
}
