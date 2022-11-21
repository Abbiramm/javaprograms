package programs;
//function Overriding


//Overriding : in case of parent child relation(inheritance)
class Employee{
	 public void display() {
		System.out.println("Display method of Employee");
	}
}
class HREmployee extends Employee{
	public void display() {
		
		System.out.println("Display method of HREmployee");
		super.display();
	}
}


public class Overriding {

	public static void main(String[] args) {
		HREmployee hob=new HREmployee();
		hob.display();

	}

}
