package Em;

public class waiter extends employee  {

	waiter(){
		wage=6000;
		
		
	}
	public void display() {
		int money=wage*12;
		System.out.println("服务员的年薪为:"+money);
	}
}
