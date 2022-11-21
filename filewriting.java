package fiels;

import java.io.FileOutputStream;
import java.io.IOException;

public class filewriting {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fo=null;
		try
		{
		 fo=new FileOutputStream("ABCDD.txt");
		fo.write(65);
		fo.write(66);
		fo.write(67);
		fo.write(70);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
		
		fo.close();
		}
	}
	

}
