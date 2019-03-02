package thread;

public class ThreadA extends Thread{
	private DeadLock deadLock;
	public ThreadA(DeadLock deadLock) {
		this.deadLock=deadLock;
	}
	public void run(){
		try {
			deadLock.method1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//ThreadB¿‡À∆

}
