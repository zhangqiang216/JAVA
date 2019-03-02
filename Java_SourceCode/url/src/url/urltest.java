package url;
import java.io.IOException;
import java.io.*;
import java.net.*;
public class urltest {
	public static void main(String[] args) throws IOException {
		URL url=new URL("http://img.zcool.cn/community/0142135541fe180000019ae9b8cf86.jpg@1280w_1l_2o_100sh.png");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
//		int code=connection.getResponseCode();
//		String xx2=connection.getResponseMessage();
//		Object xx3=connection.getContent();
//		String xx4=connection.getContentType();
//		int xx5=connection.getContentLength();
//		String xx6=connection.getContentEncoding();
//		System.out.println(xx4);
		InputStream is=connection.getInputStream();
		File file=new File("d://zq1.jpg");
		//file.createNewFile();
		FileOutputStream os=new FileOutputStream(file);
		int read=is.read();
		while(read!=-1) {
			os.write(read);
			read=is.read();
		}
		System.out.println("Íê³É");
		os.flush();
		os.close();
		is.close();
		//404 200 500 ×´Ì¬Âë
		//xml json
		//HttpClient
	}
}
