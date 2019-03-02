package thread;

public class DeadLock {
	private Integer id=12;
	private String name="zhangsan";
	public void method1() throws InterruptedException {
		synchronized (this.id) {
			System.out.println(id);
			this.id.wait(1000);//�������Ķ�����ܵ�
			//Thread.sleep(1000);//���߲��ͷ�
		}
		synchronized (this.name) {
			System.out.println(name);
		}
	}
	public void method2() throws InterruptedException {
		synchronized (this.name) {
			System.out.println(name);
			this.name.wait();//ռ�õ�name��Դ�ͷ�;
			Thread.sleep(1000);
		}
		synchronized (this.id) {
			System.out.println(id);
		}
	}
}
