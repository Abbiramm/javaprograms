package iterator;

import java.util.ArrayList;
import java.util.Iterator;



public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> l=new ArrayList<Integer>();
	l.add(23);
	l.add(45);
	l.add(56);
	
	 System.out.println(l);
	 
	 Iterator<Integer> l1=l.iterator();	
	 
	 
	 while(l1.hasNext())
	 {   
		  System.out.println(l1.next());
	 }
	
	
	}
	

}
