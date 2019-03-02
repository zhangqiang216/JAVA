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
			System.out.println("弹夹所装子弹数目为0");
		}
		System.out.println("弹夹所装子弹数目为："+num);
		System.out.println("弹夹所装子弹编号与型号依次为：");
		for(Ball s:list) {
			System.out.println("编号： "+s.getNumbering()+" 型号： "+s.getModel());
		}
		
	}
	
}
