package udpsocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ClientUDPSocket {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket();
		while(true) {
			String s = "hello world";
			byte[] buf = s.getBytes();
			InetAddress localHost = InetAddress.getLocalHost();
			DatagramPacket dp = new DatagramPacket(buf, buf.length,localHost,7777);
			ds.send(dp);
			Thread.sleep(2000);
		}

	}

}
