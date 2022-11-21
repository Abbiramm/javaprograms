package iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
   int eid;
   String enmae;
   int eage;
public Employee(int eid, String enmae, int eage) {
	super();
	this.eid = eid;
	this.enmae = enmae;
	this.eage = eage;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", enmae=" + enmae + ", eage=" + eage + "]";
}
}
	
class SortAge implements Comparator<Employee>
{
	@Override
	public int compare(Employee eob1, Employee eob2) {
		if (eob1.eage<eob2.eage)
			return -1;
		else if (eob1.eage>eob2.eage)
				return 1;
		else
			return 0;
      
}


}

public class sortingusing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee>elst=new ArrayList<Employee>();
		
		Employee e1=new Employee(1, "Zeeba", 22);
		Employee e2=new Employee(2, "Poovi", 25);
		Employee e3=new Employee(6, "Gokul", 21);
		Employee e4=new Employee(5, "Praveen",20);
		
		elst.add(e1);
		elst.add(e2);
		elst.add(e3);
		elst.add(e4);
		
		System.out.println(elst);
		
		SortAge eage=new SortAge();
		Collections.sort(elst,eage);
		
		System.out.println("After sort");
		
		System.out.println(elst);
		

		
		
	}

}
