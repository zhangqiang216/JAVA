package a;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Socket socket;
		try {
			socket = new Socket("localHost",10000);
			 InputStream is = socket.getInputStream();
	         byte[] b = new byte[10];
	         is.read(b);
	         String a=new String(b);
	         System.out.print(a);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

	}

}
