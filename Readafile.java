package fiels;

import java.io.FileInputStream;

public class Readafile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		FileInputStream fin=new FileInputStream("ABCDD.txt");
			int i=0;
			while((i=fin.read())!=-1)//to check end of file we gave -1
			{
				System.out.print((char)i);//to print character of ascii value
			}
			fin.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
