package threadd;

//another way
class Func1 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
		System.out.println(Thread.currentThread());
		
		try
		{
	      Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}       
		
	}
	
	
}
public class Threaddd3 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
                   
		
		Func1 f=new Func1();
		Thread t=new Thread(f);
		t.setName("11111");
		t.start();
		
		Func1 f2=new Func1();
		Thread t2=new Thread(f2);
		 t2.setName("222222");
		 t2.start();
		}

}
