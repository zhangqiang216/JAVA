package demo05;

public class Outer2 {
	private String name;
	
	Thread t = new Thread() {
		@Override
		public void run() {
			System.out.println("��ӡһ�仰");
		}
	};
	
	public void display() {
		int i=1;
		boolean flag =true;
		if(flag) {
			for(i=1;i<10;i++) {
				System.out.println(i);
			}
		}
		class Inner2 extends Thread{
			@Override
			public void run() {
				System.out.println("��ӡһ�仰");
			}
		}
		Inner2 inner2 = new Inner2();
		inner2.run();
		
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("��ӡһ�仰");
			}
		};
		t.run();
	}
	
	public void display2(Thread t) {
		t.run();
	}

}
