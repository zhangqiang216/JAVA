package Threadzy;
public class TicketWindows implements Runnable{
	private static int ticketNumber=1000;
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(ticketNumber>0) {
				System.out.println(Thread.currentThread().getName()+"������Ʊ��---��ʣ"+ticketNumber+"��Ʊ");
				ticketNumber--;
			}else {
				System.out.println("---��Ǹ��"+Thread.currentThread().getName()+"������");
				break;
			}	
		}
	}
}
