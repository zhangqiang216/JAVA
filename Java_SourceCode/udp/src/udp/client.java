package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class client {//客户端
	public static void main(String[] args) throws IOException, InterruptedException {
		DatagramSocket ds=new DatagramSocket();//发送者
		while(true) {
			String s="hello world";
			byte[] buf=s.getBytes();
			InetAddress localHost=InetAddress.getLocalHost();
			DatagramPacket dp=new DatagramPacket(buf,buf.length,localHost,9999);
			ds.send(dp);
			Thread.sleep(2000);
		}
		
	}
}
