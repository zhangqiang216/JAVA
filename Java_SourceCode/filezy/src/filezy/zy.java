package filezy;
import java.io.*;
public class zy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(new File("D://my.jpg"));
		File Copyfile=new File("E://mycopy.jpg");
		if(!Copyfile.exists()) {
			Copyfile.createNewFile();	
		}
		FileOutputStream fos=new FileOutputStream(Copyfile);
		int read=fis.read();
		fos.write(read);
		while(read!=-1) {
			read=fis.read();
			fos.write(read);
		}
		fis.close();
		fos.flush();
		fos.close();
	}
}


