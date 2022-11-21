package fiels;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//using REadline for reading the whole words instead of reading a character like in last programs
public class UsingReadline {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fi=new FileInputStream("ABCDD.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fi));
		String s=null;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
		}
		

	}

}
