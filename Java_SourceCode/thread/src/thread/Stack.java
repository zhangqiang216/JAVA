package thread;

public class Stack {
	
	int idx=0;
	private char[ ] data = new char[6];
	public synchronized void push(char c){
		if(idx<6) {
			data[idx]=c;
			idx++;
		}
		
	}
	public synchronized Character pop(){
		if(idx>0) {
			idx--;
			return data[idx];
		}
		return null;
	}
}
