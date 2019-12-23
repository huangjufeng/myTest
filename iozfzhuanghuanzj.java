import java.io.*;

public class iozfzhuanghuanzj {
	
	public static void main(String arg[]){
	//zfc  zhuanhuan zf
	String zfc = "cnmblgl";
	System.out.println(zfc);
	//string -) byte
	byte[] zf = zfc.getBytes();
	//byte  -) string
	System.out.println(zf[0]);
	String zfc2 = new String(zf,0,zf.length);
	
	System.out.println(zfc2);
	}
}