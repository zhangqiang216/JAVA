package zhouyi;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class zy {
	public static void f() {
		SimpleDateFormat simdf = new SimpleDateFormat("yyyy年MM月dd日");
		Calendar d=Calendar.getInstance();
		//Date d1=new Date();
		//d.setTime(d1);
		d.set(d.DAY_OF_WEEK, d.MONDAY);
		String week = simdf.format(d.getTime());
		System.out.println("本周周一的日期为："+week);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();

	}

}
