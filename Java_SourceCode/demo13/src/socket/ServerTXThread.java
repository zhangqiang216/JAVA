package socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerTXThread extends Thread {
	 private Socket socket;
	 public ServerTXThread(Socket socket) {
		 this.socket=socket;
	 }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		OutputStream os;
		try {
			os = socket.getOutputStream();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			Scanner sc = new Scanner(System.in);
			String nextLine = sc.nextLine();
			while(!"bye".equals(nextLine)) {
				bw.write(nextLine+"\n");
				bw.flush();
				nextLine = sc.nextLine();
			}
			bw.write(nextLine+"\n");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Au   to-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
