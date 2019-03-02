package Em;

public class farmer extends employee {
	farmer(){
		wage=4500;
	}
	public void display() {
		int money=12*wage;
		System.out.println("农民的年薪为:"+money);
	}
	

}
