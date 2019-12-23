package k;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class Copy1 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			
			String c;
			FileReader fr = new FileReader("E:/javaÁ·Ï°ÏîÄ¿/myTest/2.txt");
			br = new BufferedReader(fr);
			while ((c=br.readLine())!=null) {
				System.out.println(c);
				
			}
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
}
