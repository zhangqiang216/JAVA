package socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket=new Socket("localHost",9999);
		InputStream is=socket.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String readLine =br.readLine();
		while(!"bye".equals(readLine)) {
			System.out.println(readLine);
			readLine=br.readLine();
			
			
		}
		System.out.println(readLine);
		br.close();
		is.close();
	}//Ⱥ��������ͻ���
	//������һֱ������
	//���෢ÿ�����߳�
	//һ���������룬һ���������

}

