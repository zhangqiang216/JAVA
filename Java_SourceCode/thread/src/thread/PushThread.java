package thread;

public class PushThread extends Thread{
	private Stack stack;
	public PushThread(Stack stack) {
		this.stack=stack;
	}
	public void run() {
		while(true) {
			stack.push('c');
		}
		
	}

}
