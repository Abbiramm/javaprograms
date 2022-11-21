package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> s1=new ArrayList<String>();
		
		s1.add("ABC");
		s1.add("ABCD");
		s1.add("ABNV");
		System.out.println(s1);
		//using loop
		for(String n:s1)
		{
			System.out.println(n);
		}
		//using iterator
		Iterator<String> it=s1.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		//declare another list
		ArrayList<String> s2=new ArrayList<String>();
		s2.add("asdfff");
		s2.add("Another list");
		
		s1.addAll(s2);
		 System.out.println(s1);
		
	}

}
