import java.io.*;
import java.util.Date;

public class TestOutputStream {
	public static void main(String[] args) {
		String s = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			FileWriter fw = new FileWriter("log.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("----------");
			while((s = br.readLine()) != null){
				if(s.equalsIgnoreCase("exit")!=false)
				break;
				System.out.println(s.toUpperCase());
				pw.println(s);
			}
			pw.println("-----"+new Date()+"----");
			br.close();
			pw.close();
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("file can't open successfully");
		}
	}

}
