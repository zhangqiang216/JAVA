package yczy;
import java.util.ArrayList;

public class Clip {
	ArrayList<Ball> list=new ArrayList<Ball>();
	int num;
	public int getNum() {
		return num;
	}
	public void display() {
		if(num==0) {
			System.out.println("������װ�ӵ���ĿΪ0");
		}
		System.out.println("������װ�ӵ���ĿΪ��"+num);
		System.out.println("������װ�ӵ�������ͺ�����Ϊ��");
		for(Ball s:list) {
			System.out.println("��ţ� "+s.getNumbering()+" �ͺţ� "+s.getModel());
		}
		
	}
	
}
