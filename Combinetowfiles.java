package fiels;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

//Combinetwofiles
public class Combinetowfiles {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		FileInputStream f1=new FileInputStream("ABCDD.txt");
		FileInputStream f2=new FileInputStream("READandWrite.txt");
		FileOutputStream fo=new FileOutputStream("combine.txt");
		SequenceInputStream sd=new SequenceInputStream(f1,f2);
		
		int b;
		while((b=sd.read())!=-1)
{
	fo.write(b);
}
		
      f1.close();
      f2.close();
      sd.close();
      fo.close();
		
		
		
		
		
	}

}
