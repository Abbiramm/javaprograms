package fiels;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class sampleee {

	public static void main(String[] args)  {
		ArrayList<Integer> in=new ArrayList<Integer>();
		in.add(45);
		in.add(34);
		in.add(21);
		in.add(78);
		System.out.println(in);
	
		for(int n:in)
		{
			System.out.println(n);
		}
		System.out.println("...................");
		//Collections.sort(in);
		Collections.swap(in, 3, 1);
		Iterator it=in. iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Collections.shuffle(in);
		System.out.println(in);
		Collections.shuffle(in);
		System.out.println(in);
		
		
		
		
	}

}
