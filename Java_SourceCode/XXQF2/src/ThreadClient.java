import java.io.*;
import java.net.*;
public class ThreadClient extends Thread{
	private Socket s;
	public ThreadClient(Socket a) {
		 s=a;
	}
	
	public void run() {
		try {
			BufferedInputStream bis=new BufferedInputStream(s.getInputStream());
			byte[] b=new byte[1024*8];
			while(true) {
				int i=bis.read(b);
				if(i==-1) {
					break;
				}
				String msg=new String(b,0,i);
				System.out.println(msg);
			}
			bis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
