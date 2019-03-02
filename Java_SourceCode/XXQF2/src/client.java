import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket=new Socket("localHost",9997);
		BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
		new ThreadClient(socket).start();
		// �����û��������룬���͵���������
		Scanner sb=new Scanner(System.in);
		while(true) {
			String msg=sb.nextLine();
			if("exit".equals(msg)) {
				break;
			}
			byte[] b=msg.getBytes();
			bos.write(b,0,b.length);
			bos.flush();	
		}
		bos.close();
		socket.close();
	}

}
