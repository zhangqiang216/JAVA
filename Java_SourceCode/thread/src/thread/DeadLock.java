package thread;

public class DeadLock {
	private Integer id=12;
	private String name="zhangsan";
	public void method1() throws InterruptedException {
		synchronized (this.id) {
			System.out.println(id);
			this.id.wait(1000);//加了锁的对象才能等
			//Thread.sleep(1000);//休眠不释放
		}
		synchronized (this.name) {
			System.out.println(name);
		}
	}
	public void method2() throws InterruptedException {
		synchronized (this.name) {
			System.out.println(name);
			this.name.wait();//占用的name资源释放;
			Thread.sleep(1000);
		}
		synchronized (this.id) {
			System.out.println(id);
		}
	}
}
