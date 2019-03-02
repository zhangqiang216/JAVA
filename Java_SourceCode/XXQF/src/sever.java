
import java.io.*;
import java.net.*;
import java.util.*;

public class sever {
	static List<Socket> list=new LinkedList<>();
	public static void main(String[] args) throws IOException {
		 ServerSocket ss = new ServerSocket(9998);
		 while(true) {
			Socket socket = ss.accept();
			list.add(socket);
			new ThreadSever(socket).start();
			}
	}

}
