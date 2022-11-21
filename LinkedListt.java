package iterator;

import java.util.Iterator;
import java.util.LinkedList;

class Emp
{
	
	int id;
	String name;
	float salary;
	public Emp(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class LinkedListt {

	public static void main(String[] args) {
		LinkedList<Emp> lis=new LinkedList<Emp>();
		// TODO Auto-generated method stub
		Emp e1=new Emp(1,"asdf",23f);
		Emp e2=new Emp(2,"asdfg",22f);
		Emp e3=new Emp(3,"asdfhh",26f);
         
		lis.add(e1);
		lis.add(e2);
		lis.add(e3);
		//System.out.println(lis);
		Iterator<Emp> it=lis.iterator();
		while(it.hasNext())
		{
			Emp ee=it.next();
			System.out.println(ee.id+"\t"+ee.name+"\t"+ee.name);
		}
	}

}
