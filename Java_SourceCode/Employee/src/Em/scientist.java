package Em;

public class scientist extends employee  {
	int endyearwage;
	scientist(){
		wage=10000;
		endyearwage=100000;
	}
	public void display() {
		int money=wage*12+endyearwage;
		System.out.println("��ѧ�ҵ���нΪ:"+money);
	}

}
