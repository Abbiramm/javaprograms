import java.util.ArrayList;
import java.util.Iterator;



public class Iteraotrlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lst=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			lst.add(i);
		}
		
		Iterator<Integer> it=lst.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Using lambda\n");
		//using lambda
		lst.forEach(x->System.out.println(x));
		
		
		

	}

}
