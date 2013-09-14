import java.net.*;
import java.io.*;

public class TcpClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1",6666);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String strOut = null;
			BufferedReader br = null;
			do{
			   br = new BufferedReader(new InputStreamReader(System.in));
			   strOut=br.readLine();
				while(strOut != null){
					dos.writeUTF(strOut);
				}
			}while(!strOut.equals("exit"));
			String strIn = null;
			while((strIn=dis.readUTF())!=null){
				System.out.println(strIn);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} //catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			//e.printStackTrace();
		//}
	}

}