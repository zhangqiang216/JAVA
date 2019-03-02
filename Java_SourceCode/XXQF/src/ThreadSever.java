import java.io.*;
import java.net.*;

public class ThreadSever extends Thread{
	private Socket socket;
	BufferedReader br;
	public ThreadSever(Socket a) throws UnsupportedEncodingException, IOException {
		this.socket=a;
		br = new BufferedReader(new InputStreamReader(
				a.getInputStream() , "utf-8")); 
		
		
		}
	public void run() {
		 try{  
			 	String content = null;  
	            // 采用循环不断从Socket中读取客户端发送过来的数据  
	            while ((content = br.readLine()) != null)  
	            {  
	                
	                for (Socket s : sever.list)  
	                {  
	                	if(!socket.equals(s)) {
	                		OutputStream os = s.getOutputStream();  
		                    os.write((content + "\n").getBytes("utf-8"));
	                	}
	                    
	                }  
	            }  
	            br.close();
	            
//			 	BufferedInputStream br=new BufferedInputStream(socket.getInputStream());
//	            byte[] b=new byte[1024];
//	            String msg="";
//	            int i;
//	            while (true)  
//	            {  
//	            	i=br.read(b);
//	            	if(i==-1) {
//	            		break;
//	            	}
//	            	msg=new String(b,0,i);
//	            	
//	           
//	                for (Socket s : sever.list)  
//	                {  
//	                	if(!s.equals(socket)) {
//	                		BufferedOutputStream  bos = new BufferedOutputStream(s.getOutputStream());  
//		                    byte[] c=msg.getBytes();
//		                    bos.write(c,0,c.length);
//		                    bos.flush();
//		                    
//	                	}
//	            
//	                }  
//	            }  
	        }catch (IOException e)  
	        {  
	            e.printStackTrace();  
	        }  
	}
}
