package thread;

public class test2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {//���߻����쳣
//				e.printStackTrace();
//			}
			System.out.println(this.getName()+"����ִ������");
		}
	}
}
