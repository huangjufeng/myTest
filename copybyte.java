package k;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copybyte{


	public static void main(String[] args) throws IOException{

	FileInputStream fi = null;
	FileOutputStream fo = null;
	
	try{
	fi =  new FileInputStream("E:/java��ϰ��Ŀ/myTest/11.txt");
	fo = new FileOutputStream("E:/java��ϰ��Ŀ/myTest/2.txt");
	int c;
	
	while(( c = fi.read())!=-1){
		fo.write(c);
	}
	}
	finally{
		if(fi!=null) {fi.close();}
		if(fo!=null) {fo.close();}
		System.out.println("ghg");
	}

	}
	}
