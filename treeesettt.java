package iterator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Studen{
	int sid;
	String sname;
	float sfees;
	public Studen(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "Studen [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
}

class SortId implements Comparator<Studen>{

	@Override
	public int compare(Studen s1, Studen s2) {
		if(s1.sid<s2.sid)
		return -1;
		else if(s1.sid>s2.sid)
			return 1;
		else
			return 0;
	}
	
}

public class treeesettt {

	public static void main(String[] args) {
		SortId sob=new SortId();
		TreeSet<Studen> st=new TreeSet<>(sob);
		Studen s1=new Studen(4,"Jeba",8768);
		Studen s2=new Studen(1,"Gokul",18768);
		Studen s3=new Studen(9,"Shiv",165768);
		Studen s4=new Studen(2,"Gopika",436576);
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		
		System.out.println(st);
		
		System.out.println("Using Iterator");
		Iterator<Studen> it=st.iterator();
		
		System.out.println("SID\tSNAME\tSFEES");
		while(it.hasNext()){
			Studen ob=it.next();
			System.out.println(ob.sid+"\t"+ob.sname+"\t"+ob.sfees);
		}
				
		
	}

}
