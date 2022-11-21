package fiels;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyingtoanotherclasswithcapitalletters {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("ABCDD.txt");
		FileOutputStream fos=new FileOutputStream("READandWrite.txt");
		
		int i=0;
		while((i=fis.read())!=-1) {
			                    //65 to 97
			if(i>=97 && i<=122) {//changing small to capital
			  fos.write((i-32));
			  System.out.print((char)(i-32));
			}
			else {
				fos.write(i);
				System.out.print((char)(i));
			}
		}
		System.out.println("new file is copied copyedu.txt");
		fis.close();
		fos.close();
	}

}
