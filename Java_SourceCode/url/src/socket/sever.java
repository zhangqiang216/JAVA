package socket;

import java.io.IOException;
import java.io.*;
import java.net.ServerSocket;
import java.util.Scanner;
import java.net.*;

public class sever {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server=new ServerSocket(9999);
		Socket socket=server.accept();
		OutputStream os=socket.getOutputStream();
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
		Scanner sc=new Scanner(System.in);
		String nextline=sc.nextLine();
		while(!"bye".equals(nextline)) {
			bw.write(nextline+'\n');
			bw.flush();
			nextline=sc.nextLine();
		}
		bw.write(nextline+'\n');
		bw.flush();
		bw.close();
	}

}
