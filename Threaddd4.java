package threadd;
class Th extends Thread
{
	  public void run()
	  {
		  
		  System.out.println(Thread.currentThread());
	  }
	
}

public class Threaddd4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Th t1=new Th();
		//t1.setPriority(5);
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Thread priority :"+t1.getPriority());
		t1.start();
		Th t2=new Th();
	
		t2.setPriority(Thread.MAX_PRIORITY);
		//t2.setPriority(8);
		System.out.println("Thread pirority2 :"+t2.getPriority());
	
		t2.start();
		
		
	}

}
