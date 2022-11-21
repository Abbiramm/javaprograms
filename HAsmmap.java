package iterator;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HAsmmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Long,String> hm=new HashMap<Long,String>();
		
		hm.put(234234234l,"asdf");
		hm.put(234234236l,"asdfhh");
		hm.put(234234235l,"asdfgg");

		
		Set<Entry<Long,String>> ent=hm.entrySet();
		for(Entry<Long,String>ent1:ent)
		{
			System.out.println(ent1.getKey()+"---->"+ent1.getValue());
		}
	}

}
