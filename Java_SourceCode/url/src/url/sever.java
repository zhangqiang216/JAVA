package url;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class sever {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(9999);
		Socket socket=server.accept();
	}

}
