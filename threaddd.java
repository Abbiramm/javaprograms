package threadd;
//one way of thread

class Myfunc extends Thread
{
	public void run()
	{
		 for(int i=1;i<=5;i++)
		 {
	 	System.out.println("Inside the class"+Thread.currentThread());
	     }
	}
	
	
}
public class threaddd {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main thread"+Thread.currentThread());
		
	Myfunc m=new Myfunc();
	m.start();
	Myfunc m2=new Myfunc();
	m2.setName("asdfs");
	m2.start();
		
		
		}

}
