package file;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//File file=new File("D://aaa/");//文件夹，带后缀的话文件
		//File file=new File("D://aaa.txt");
//		File f = new File("D://aaa.txt");
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if (!f.exists()) {
//		boolean r = false;
//		try {
//		r = f.createNewFile();
//		} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		}
//		if (r) {
//		System.out.println("文件创建成功！");
//		}
//		}
		
		File dir = new File("D://aaa");
		if (!dir.exists()) {///aaa/aaa/test.txt
			//如果不存在就创建
			//boolean s=dir.mkdir();
			boolean s=dir.mkdirs();//创建多级
			System.out.println(s);
			}
		String[] fs = dir.list();
		for (int i = 0; i < fs.length; i++) {
		System.out.println(fs[i]);
		}
		
		
	}

}
