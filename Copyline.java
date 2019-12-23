package k;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Copyline {

	public static void main(String[] args) throws IOException{

		BufferedReader   br = null;
		PrintWriter pw = null;
		
		try {
			br = new BufferedReader(new FileReader("E:/java练习项目/myTest/2.txt"));
			pw = new PrintWriter(new FileWriter("E:/java练习项目/myTest/46.txt"));
			
			
			String line;
			
			while((line=br.readLine())!=null) {
				pw.write(line);
			}
		}
		finally {
			if(br!=null) {
				br.close();
			}if(pw!=null) {
				pw.close();
			}
		}
		
		
	}

}
