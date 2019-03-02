package innerClass;

public class Outer2 {
	public void display() {
		int i=1;
		boolean flag =true;
		if(flag) {
			for(i=1;i<10;i++) {
				System.out.println("i");
			}
		}
		class Inner2 extends Thread{
			
		}
		Inner2 inner2=new Inner2();
		Thread t=new Thread() {
			public void run() {
				
			}
		};
		
	}//匿名内部类必须付磊
	

}
