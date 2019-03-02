package udpsocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerUDPSocket {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds= new DatagramSocket(7777);
		byte[] buf = new byte[1024];
		while(true) {
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			String s = new String(buf);
			System.out.println(s);
		}
	}

}
