package domo7;

public class student {
	public void display() {
		try {
			Class.forName("domo07.text");
			//System.exit(0);//������ֹ����finally
			return;
		}catch(ClassNotFoundException e) {
			System.out.println("");
			
			
		}finally {
			System.out.println("finally");
			
		}
	}
	//��finally��ruturn

}
