import java.io.*;
import java.net.*;
import java.util.LinkedList;
import java.util.List;
public class server {
	static List<Socket> list=new LinkedList<>();
	public static void main(String[] args) throws IOException {
		 ServerSocket ss = new ServerSocket(9997);
		 while(true) {
			Socket socket = ss.accept();
			list.add(socket);
			new ThreadServer(socket).start();
			}
	}

}
