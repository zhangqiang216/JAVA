package file2;
import java.io.*;
public class domain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		student st=new student(5);
//		File file =new File("D://a.obj");
//		file.createNewFile();
//		FileOutputStream fos=new FileOutputStream(file);
//	    ObjectOutputStream oos=new ObjectOutputStream(fos);
//	    oos.writeObject(st);
//	    oos.close();
//	    
//	    FileInputStream fis=new FileInputStream(file);
//	    ObjectInputStream oin=new ObjectInputStream(fis);
//	    Object newperson=oin.readObject();
//	    oin.close();
//	    System.out.print(newperson);
		
		
		
//		DataOutputStream dos =
//				new DataOutputStream(new FileOutputStream("D:lww//a.txt"));
//				dos.writeUTF("身高：");
//				dos.writeDouble(15.2);
//				dos.writeUTF("年龄：");
//				dos.writeInt(15);
//				dos.flush();
//				dos.close();
//				DataInputStream dis =
//				new DataInputStream(new FileInputStream("D://lww//a.txt"));
//				String title1 = dis.readUTF();
//				double d = dis.readDouble();
//				System.out.println(title1+d);
//				String title2 = dis.readUTF();
//				int i = dis.readInt();
//				System.out.println(title2+i);
//				dis.close();
		
		File s=new File("d://帐户信息.txt");
		//s.createNewFile();
		File s2=new File("D://帐户信息-copy.txt");
		//s2.createNewFile();
		FileReader fr = new FileReader(s);
		BufferedReader br = new BufferedReader(fr);
		//使用BufferedReader包装FileReader
		
		FileWriter fw = new FileWriter(s2);
		BufferedWriter bw = new BufferedWriter(fw);
		//使用BufferedWriter包装FileWriter
		String str = br.readLine();
		while (str != null) {
		bw.write(str);
		str = br.readLine();
		}
		bw.flush();
		bw.close();
		fw.close();
		br.close();
		fr.close();
		
	}
}
