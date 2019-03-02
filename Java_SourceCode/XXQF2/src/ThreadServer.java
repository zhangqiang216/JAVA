import java.io.*;
import java.net.*;
public class ThreadServer extends Thread{
	private Socket socket;
	public ThreadServer(Socket a) throws UnsupportedEncodingException, IOException {
		this.socket=a;
	}
	public void run() {
		try {
			BufferedInputStream bis=new BufferedInputStream(socket.getInputStream());
			byte[] b=new byte[1024];
			String msg="";
			while(true) {
				int i=bis.read(b);
				if(i==-1) {
					break;
				}
				msg=new String(b,0,i);
				for(Socket s:server.list) {
					if(!socket.equals(s)) {
						out(s,msg);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void out(Socket s,String msg) throws IOException {
		BufferedOutputStream bos=new BufferedOutputStream(s.getOutputStream());
		byte[] b=msg.getBytes();
		bos.write(b,0,b.length);
		bos.flush();
	}

}
