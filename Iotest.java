import java.io.*;

public class Iotest{
	
//递归读取文件夹的文件
public static void main(String [] arg){
	Iotest.listFile("D:/");
}

public static void listFile(String path){
	
	if(path == null){
		return ;
	}
	
	File[] files = new File(path).listFiles();

	if(files ==null){
		return ;
	}
	
	
	for(File file :files){
	
		if(file.isFile()){
			System.out.println(file.getName());
		}
		else if(file.isDirectory()){
			System.out.println("Directory"+file.getName());
			listFile(file.getPath());
		}
		else{
			System.out.println("Error");
		}
		
		
	
	}

}

}
