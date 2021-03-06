import java.net.*;
import java.io.*;

public class TcpServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(6666);
			while(true){
				Socket s = ss.accept();
				System.out.println("A client connectec successfully");
				DataInputStream dis = new DataInputStream(s.getInputStream());
				String strIn = null;
				
				if((strIn = dis.readUTF()) !=  null)
					System.out.println(strIn);
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				String strOut = null;
				BufferedReader br = null;
				do{
					   br = new BufferedReader(new InputStreamReader(System.in));
					   strOut=br.readLine();
						while(strOut != null){
							dos.writeUTF(strOut);
						}
				}while(!strOut.equals("exit"));
				dos.close();
				dis.close();
				br.close();
				s.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
