package Threadzy;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindows w=new TicketWindows();
		Thread w1=new Thread(w);
		w1.setName("1����Ʊ����");
		Thread w2=new Thread(w);
		w2.setName("2����Ʊ����");
		Thread w3=new Thread(w);
		w3.setName("3����Ʊ����");
		Thread w4=new Thread(w);
		w4.setName("4����Ʊ����");
		Thread w5=new Thread(w);
		w5.setName("5����Ʊ����");
		Thread w6=new Thread(w);
		w6.setName("6����Ʊ����");
		Thread w7=new Thread(w);
		w7.setName("7����Ʊ����");
		Thread w8=new Thread(w);
		w8.setName("8����Ʊ����");
		Thread w9=new Thread(w);
		w9.setName("9����Ʊ����");
		Thread w10=new Thread(w);
		w10.setName("10����Ʊ����");
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
