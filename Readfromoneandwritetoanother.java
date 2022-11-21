package fiels;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Readfromoneandwritetoanother {

	public static void main(String[] args) throws IOException {
		
		
		
		FileInputStream fi=new FileInputStream("ABCDD.txt");
		FileOutputStream fo=new FileOutputStream("READandWrite.txt");
		int i=0;
		while((i=fi.read())!=-1)
             {
	            
		         fo.write(i);
		
		
		}
          
		fi.close();
		fo.close();
		System.out.println("Copied to another");
		
	}

}
