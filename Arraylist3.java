package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Float> c=new ArrayList<Float>();
		int n;
		float d;
		int de;
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the array element:");
			d=sc.nextFloat();
			c.add(d);
			
		}
		//System.out.println(c);
             
		for(float b:c)
		{
			System.out.println(b);
		}
		//using iterator
		System.out.println("Using iterator");
		Iterator<Float> it=c.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//contains
		System.out.println(c.contains(5));
		
		
		ArrayList<Integer> i=new ArrayList<Integer>();
		System.out.println("Enter 5 values:");
		for(int j=0;j<5;j++)
		{    de=sc.nextInt();
			i.add(de);
		}
		System.out.println(i);
		//contains
		System.out.println(i.contains(45));
		//Remove
		System.out.println(i.remove(2));// third element will be removed.
		System.out.println(i);
		
		
		
	}

}
