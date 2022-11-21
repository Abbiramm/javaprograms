package threadd;
//

class Myfunc1 extends Thread
{
	public void run()
	{
		 for(int i=1;i<=5;i++)
		 {
	 	System.out.println("Inside the class"+Thread.currentThread());
	 	try
	 	{
	 	Thread.sleep(5000);
	     }
	 	catch(InterruptedException e)
	 	{
	 		e.printStackTrace();
	 	}
		 }
	}
	
	
}
public class Threaddd2 {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Main thread"+Thread.currentThread());
		
	Myfunc1 m=new Myfunc1();
	m.start();
	m.join();
	Myfunc1 m2=new Myfunc1();
	m2.setName("asdfs");
	m2.start();
		
		
		}

}
