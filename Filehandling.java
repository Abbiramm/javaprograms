package fiels;

import java.io.File;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args) throws IOException
	 {
		
		
		File myfile=new File("ABCDD.txt");
		if(myfile.createNewFile())
			System.out.println("File is created");
			 
		else
			System.out.println("File is already there");

	}

}
