package k;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Copy2 {
	public static void main(String[] args) throws IOException{

		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
	
		BufferedWriter bw = null;
		
		try {
			bw =new BufferedWriter(new FileWriter("E:/java��ϰ��Ŀ/myTest/426.txt"));
			
			bw.write(s);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			if(bw!=null) {
				bw.close();
				sc.close();
			}
		}
		

		
		
	}
}
