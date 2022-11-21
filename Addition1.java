
interface Addition
{
	void add(int a,int b);
}
public class Addition1 {

	public static void main(String[] args) {
		Addition aon=(int i,int j)->{
			int s=i+j;
			System.out.println("Sum "+s);
		};
		
		aon.add(5,6);
		
		//predefined interface Runnable
		
		Runnable r=()->{
			System.out.println("run mehtod is called");
		};
		Thread th=new Thread(r);
		th.start();

	}

}
