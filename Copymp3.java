package k;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Copymp3{

	public static void main(String[] args) throws IOException{
	
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	try {
		FileReader fi = new FileReader("E:/java练习项目/myTest/2.txt");
		br = new BufferedReader(fi);
		String c;
		while((c=br.readLine())!=null) {
			System.out.println(c);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Scanner sc = new Scanner(System.in);
	try {
		PrintStream p = new PrintStream("E:/java练习项目/myTest/4646.txt");
		System.setOut(p);
		System.out.println("siquliuguolan");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
	}
}
