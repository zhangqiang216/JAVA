import java.io.*;
import java.net.*;

public class ThreadSocket1 extends Thread {
	 private Socket s;
	 public ThreadSocket1(Socket a) {
		 s=a;
	 }
	 BufferedReader br = null;  
	 //OutputStream os = null;  
	 public void run() {  
		 try {  
			 br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			 String content = null;  
             while ((content = br.readLine()) != null)  
             {  
            	 System.out.println(content);
                    
             }  
             br.close();
//	            br = new BufferedInputStream(s.getInputStream());  
//				//os = s.getOutputStream();
//	            byte[] b=new byte[1024];
//	            String content = null;  
//	            while (true){ 
//	            	int i=br.read(b);
//	            	if(i==-1) {
//	            		break;
//	            	}
//	            	content=new String(b,0,i);
//	            }  
//	            System.out.println(content);
//	            br.close();
	              
		 } catch (IOException e1){
				e1.printStackTrace();
		 }
		 
	 }
}
