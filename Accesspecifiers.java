package addd;

import add.banking;
class Student
{
	
	private int id;
	private String name;
	
	
	void display() {
		
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		}
	}


public class Accesspecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Student ob=new Student();
             banking ob1=new banking();
             ob.display();
             ob1.displayAmount();
	}

}
