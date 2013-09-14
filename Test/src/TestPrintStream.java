import java.io.*;

public class TestPrintStream {
	public static void main(String[] args) {
		PrintStream ps = null;
		try{
			FileOutputStream fos = new FileOutputStream("testpintstream.txt");
			ps = new PrintStream(fos);
			if(ps != null)
				System.setOut(ps);
		}catch(IOException e){
			e.printStackTrace();
		}
		int num = 0;
		for(int i=0; i<60000; i++){
			
			System.out.print((char)i+" ");
			if(num++<100){
				System.out.println();
			}
		}
	}

}
