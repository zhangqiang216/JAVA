package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageFileReader {
//	public static void main(String[] args) {
//		File res=new File("D://b.jpg");
//		try {
//			res.createNewFile();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		try {
//			FileInputStream fis=new FileInputStream(new File("D://a.jpg"));
//			FileOutputStream fos=new FileOutputStream(res);
//			try {
//				
//				int read=fis.read();
//				fos.write(read);
//				while(read!=-1) {
//					System.out.println(read);
//					read=fis.read();
//					fos.write(read);
//				}
//				fis.close();
//				fos.flush();//Çå¿ÕÁ÷µÄ»º´æ
//				fos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
