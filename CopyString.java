package k;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyString {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("E:\\java练习项目\\myTest/2.txt");
			fw = new FileWriter("E:\\java练习项目\\myTest/210.txt");
			
			int c ;
			while ((c=fr.read())!=-1) {
				fw.write(c);
			}
		}
		finally {
			if(fr!=null) {
				fr.close();
			}if(fw!=null) {
				fw.close();
			}
			System.out.println("程序完成");
		}
	}
}
