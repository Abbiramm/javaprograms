package threadd;
//Multithread
class Table
{

	synchronized  void methodPrint(int num) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"x"+i+"="+num*i);
		}
		
	}
	
}
class Mthread1 extends Thread
{   Table tob1;
      
      Mthread1(Table t)
      {
    	  tob1=t;
    	  
      }
    public void run()
    {
    	tob1.methodPrint(2);
    }
	
	
}
class Mthread2 extends Thread
{   Table tob2;
      
      Mthread2(Table t)
      {
    	  tob2=t;
    	  
      }
    public void run()
    {
    	tob2.methodPrint(5);
    }
	
	
}



public class THreaddd5 {

	public static void main(String[] args) {
		
		Table t=new Table();
		Mthread1 t1=new Mthread1(t);
		t1.setName("Two");
		t1.start();
		
		Mthread2 t2=new Mthread2(t);
		t2.setName("Five");
		t2.start();
		

	}

}
