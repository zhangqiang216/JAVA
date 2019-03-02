package thread;

public class PopThread extends Thread{
	private Stack stack;
	public PopThread(Stack stack) {
		this.stack=stack;
	}
	public void run() {
		while(true) {
			stack.pop();
			
		}
		
		
	}

}
