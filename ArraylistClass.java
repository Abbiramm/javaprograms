package iterator;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
	
	int id;
	String name;
	float fees;
	public Student(int id, String name, float fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
	
	
}

public class ArraylistClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Student> slist=new ArrayList<Student>();
       Student s1=new Student(1,"ABC",45.0f);
       Student s2=new Student(2,"ABCD",45.0f);
       Student s3=new Student(3,"ABCDE",45.0f);
       
       slist.add(s1);
       slist.add(s2);
       slist.add(s3);
       
       System.out.println(slist);
       
        //using Iterator for class
       System.out.println("***********************");
       Iterator<Student> it=slist.iterator();
       System.out.println("ID\tNAME\tFEES");
       while(it.hasNext())
       {
    	   Student st=it.next();
    	   System.out.println(st.id+"\t"+st.name+"\t"+st.fees);
    	   
    	   
       }
	}

}
