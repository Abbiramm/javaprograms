package pack1;

import java.util.function.Function;

public class functiondemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a function reference to lambda expression.
		//to find the length of a string.
		
		Function<String,Integer>len=(str)->str.length();
		//find the length of the string
		String str="Edubridge Learning";
		System.out.println("Length="+len.apply(str));

	}

}
