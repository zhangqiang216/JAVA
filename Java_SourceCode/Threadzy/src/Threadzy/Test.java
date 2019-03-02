package Threadzy;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindows w=new TicketWindows();
		Thread w1=new Thread(w);
		w1.setName("1号售票窗口");
		Thread w2=new Thread(w);
		w2.setName("2号售票窗口");
		Thread w3=new Thread(w);
		w3.setName("3号售票窗口");
		Thread w4=new Thread(w);
		w4.setName("4号售票窗口");
		Thread w5=new Thread(w);
		w5.setName("5号售票窗口");
		Thread w6=new Thread(w);
		w6.setName("6号售票窗口");
		Thread w7=new Thread(w);
		w7.setName("7号售票窗口");
		Thread w8=new Thread(w);
		w8.setName("8号售票窗口");
		Thread w9=new Thread(w);
		w9.setName("9号售票窗口");
		Thread w10=new Thread(w);
		w10.setName("10号售票窗口");
		w1.start();
		w2.start();
		w3.start();
		w4.start();
		w5.start();
		w6.start();
		w7.start();
		w8.start();
		w9.start();
		w10.start();
	}
}
