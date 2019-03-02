package zuoyexxxx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ddd {
	void display1(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(sdf.format(date));
		
	}
	
	void display2(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
		System.out.println(sdf.format(date));
		
	}
	
	void display3(Date date) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyƒÍM‘¬dd»’");
		System.out.println(sdf.format(date));
		
	}
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d1=new Date();
		ddd a=new ddd();
		a.display1(d1);
		a.display2(d1);
		a.display3(d1);
	}
	
	
	
	
}
