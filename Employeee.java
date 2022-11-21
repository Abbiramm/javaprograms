package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class em
{
    int eid;
    String ename;
    int eage;
	public em(int eid, String ename, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "em [eid=" + eid + ", ename=" + ename + ", eage=" + eage + "]";
	}
    
}
//name
class Sortage implements Comparator<em>

{
	public int compare(em e11,em e21)
	{
		return e11.ename.compareTo(e21.ename);
	}
}


public class Employeee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                      ArrayList<em> elst=new ArrayList<em>();
                      
		em e1=new em(1,"abcd",34);
		em e2=new em(2,"a",32);
		em e3=new em(3,"abc",38);
		elst.add(e1);
		elst.add(e2);
		elst.add(e3);
		//System.out.println(elst);
		
		Sortage sc=new Sortage();
		Collections.sort(elst,sc);
		System.out.println("...............................");
		Iterator<em> it=elst.iterator();
		while(it.hasNext())
{
	          em ee=it.next();
	          System.out.println(ee.eid+"\t"+ee.ename+"\t"+ee.eage);
}
		
		
	}

}
