package iterator;

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treesett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> st=new TreeSet<Integer>();
        //1.No duplicate values
//2.Ascending Order is  maintained
//3.Null value is not  allowed.
st.add(89);
st.add(90); 
st.add(45);
st.add(56);
st.add(56);
//st.add(null);

System.out.println(st);

	}

}
