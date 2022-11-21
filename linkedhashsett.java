package iterator;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashsett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Integer> st=new LinkedHashSet<Integer>();
        //1.No duplicate values
//2.Order is maintained
//3.Null value is allowed.
st.add(89);
st.add(90); 
st.add(45);
st.add(56);
st.add(56);
st.add(null);

System.out.println(st);
	}

}
