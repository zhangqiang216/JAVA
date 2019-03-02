package Em;

public class teacher extends employee {
	int fee;
	teacher(){
		wage=6000;
		fee=120;
	}
	public void display() {
		int money=wage*12+fee*365;
		System.out.println("老师的年薪为:"+money);
	}
	

}
