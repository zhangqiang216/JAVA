package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class sever {//服务接收端
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(9999);
		byte[] buf=new byte[1024];
		while(true) {
			DatagramPacket dp=new DatagramPacket(buf,buf.length);
			ds.receive(dp);
			String s=new String(buf);
			
		}
		
	}

}
