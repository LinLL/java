import java.io.*;

public class TestDataStream {
	public static void main(String[] args) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		try{
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			DataInputStream dis= new DataInputStream(bis);
			System.out.println(dis.available());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			dos.close();
			dis.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
