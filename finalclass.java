package programs;
//function Overriding


//Overriding : in case of parent child relation(inheritance)
final class Employee{//final class is given hence there will be no child class for this parent class
	final void display() {
		
		final int s=100;
		s=300;//it shows error because final is used.hence the value is unale to change
		System.out.println("Display method of Employee");
	}
}
class HREmployee extends Employee{
	 void display() {
		
		System.out.println("Display method of HREmployee");
		super.display();//final dispaly is given,hence the display cannot be used it shows error
	}
}


public class finalclass {

	public static void main(String[] args) {
		HREmployee hob=new HREmployee();
		hob.display();

	}

}
