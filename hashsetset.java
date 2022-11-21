package iterator;

import java.util.HashSet;
import java.util.Set;

public class hashsetset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> st=new HashSet<Integer>();
		            //1.No duplicate values
		//2.Order is not maintained
		//3.Null value is allowed.
		st.add(89);
		st.add(90); 
		st.add(45);
		st.add(56);
		st.add(null);
		
		System.out.println(st);
		

	}

}
