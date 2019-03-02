import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//"hell world" 在常量区
		//String s=new String("hello world"),在s在栈区，分配的内存在堆区
		String s="hello world";
		String con=s.concat("msy");
		System.out.println(con);
		//indexof lastIndexOf
		//startsWith("hello")
		StringBuffer w=new StringBuffer("hello");
		w.append("world");//w改变
		w.delete(5, 9);
		w.insert(5,"wf" );
		w.toString();
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");
		String  format=sdf.format(d);
		
		
		Calendar c=Calendar.getInstance();
		System.out.println(c);
		int i=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(i);
		//c.set(Calendar.YEAR,2019);
		Instant now=Instant.now();
		System.out.println(now.toString());
		
		
		
	}

}
