import java.io.*;

public class TestFileRead {//这个文件用来测试字符流的输入

	public static void main(String[] args) {
		int b;
		FileReader fr = null;
		try{
			fr = new FileReader("/home/luolin/workspace/Test/src/TestFileRead.java");
			while((b=fr.read()) != -1){
				System.out.print((char)b);
			}
				
		}catch(FileNotFoundException e){
			  System.out.println("file open unsuccessfully");
		 }
		catch(IOException e){
			System.out.println("file read unsuccessfully");
		}
		  
		
	}

}
