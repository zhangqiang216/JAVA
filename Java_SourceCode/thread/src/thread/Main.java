package thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("开始执行：");
		
		Thread thread =new Thread(new println());
		//thread.setPriority(Thread.MIN_PRIORITY);
		System.out.println(thread.isAlive());
		thread.start();
		System.out.println(thread.getPriority());
		Thread Thread2=new test2();
		Thread2.start();//与run()区别，run()会在主线程中执行，start();
		Thread t2=Thread.currentThread();
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		for(int i=0;i<10;i++) {
			System.out.println(t2.getName()+"主你好");
		}
//		new Thread() {
//			public void run() {
//				for(int i=0;i<10;i++) {
//					System.out.println(i);
//				}
//			}
//		}.start();
		
		
		
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for(int i=0;i<10;i++) {
//					System.out.println(i);
//				}
//			}
//
//		}
//		).start();
		
		

	}

}
