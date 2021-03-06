import java.io.*;

public class TestBufferedStream {
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("/home/luolin/workspace/Test/src/HelloJava.java");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int c = 0;
			for(c=0; (c=bis.read())!=-1; c++){
				System.out.print((char)c);
			}
			bis.mark(50);
			for(c=0; (c=bis.read())!=0; c++){
				System.out.print((char)c);
			}
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("File can't open successfully");
			System.exit(-1);
		}
	}

}
