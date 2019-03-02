package Threadzy;
public class TicketWindows implements Runnable{
	private static int ticketNumber=1000;
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(ticketNumber>0) {
				System.out.println(Thread.currentThread().getName()+"正在售票中---还剩"+ticketNumber+"张票");
				ticketNumber--;
			}else {
				System.out.println("---抱歉！"+Thread.currentThread().getName()+"已售罄");
				break;
			}	
		}
	}
}
