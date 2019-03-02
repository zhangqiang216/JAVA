package domo7;

public class student {
	public void display() {
		try {
			Class.forName("domo07.text");
			//System.exit(0);//运行终止，不finally
			return;
		}catch(ClassNotFoundException e) {
			System.out.println("");
			
			
		}finally {
			System.out.println("finally");
			
		}
	}
	//先finally后ruturn

}
