package socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket=new Socket("localHost",9999);
		InputStream is=socket.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String readLine =br.readLine();
		while(!"bye".equals(readLine)) {
			System.out.println(readLine);
			readLine=br.readLine();
			
			
		}
		System.out.println(readLine);
		br.close();
		is.close();
	}//群发给多个客户端
	//服务器一直监听，
	//互相发每个两线程
	//一个负责输入，一个负责输出

}

