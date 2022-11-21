package threadd;

import java.io.IOException;

class sam1 extends Thread
{
	public void run()
	
	{
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread());
			
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
 

public class Threadsample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		sam1 s1=new sam1();
		s1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("MINNNN"+s1.getPriority());
		
		sam1 s2=new sam1();
		s2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("MAXXXXXX"+s2.getPriority());

	}

}
