package url;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpClientDemo {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		 HttpClientBuilder create = HttpClientBuilder.create();
		 HttpClient client = create.build();
		 HttpGet request = new HttpGet("http://y1.ifengimg.com/cmpp/2014/03/11/02/a034623a-1047-43f2-81f3-6e65524c5916.jpg");  
         HttpResponse response = client.execute(request);  
         int statusCode = response.getStatusLine().getStatusCode();
          if(statusCode==200) {
        	  HttpEntity entity = response.getEntity();
        	  InputStream is = entity.getContent();
        	  File file = new File("d://download1.jpg");
      		FileOutputStream os = new FileOutputStream(file);
      		int read = is.read();
    		while(read!=-1) {
    			os.write(read);
    			read = is.read();
    		}
    		System.out.println("Õº∆¨œ¬‘ÿÕÍ≥…");
    		os.flush();
    		os.close();
    		is.close();
          }
	}

}
