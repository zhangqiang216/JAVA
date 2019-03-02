package thread;

public class println implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		
		for(int i=0;i<10;i++) {
			System.out.println(t.getName()+"ÄãºÃ");
		}
	}

}
