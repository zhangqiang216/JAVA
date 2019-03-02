import java.io.*;
import java.net.*;
import java.util.Scanner;


public class client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket=new Socket("localHost",9998);
		//BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
		new ThreadSocket1(socket).start();
		// 接收用户键盘输入，发送到服务器端

//		Scanner sb=new Scanner(System.in);
//		while(true) {
//			String msg=sb.nextLine();
//			if("exit".equals(msg)) {
//				break;
//			}
//			byte[] b=msg.getBytes();
//			bos.write(b,0,b.length);
//			bos.flush();
//			
//		}
//		bos.close();
//		socket.close();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		String msg = null;
		while ((msg = in.readLine()) != null) {
			if("exit".equals(msg)) {
				break;
			}
			out.println(msg);
			out.flush();
		}
		out.close();
		in.close();
		socket.close();
	}
}
