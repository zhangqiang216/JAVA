package shengri;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Sr {
	public static void main(String [] args) throws ParseException {
		LocalDate now=LocalDate.now();
		LocalDate birthday=LocalDate.of(2018,8,30);
		//System.out.println(birthday);
		//Period period =Period.between(now, birthday);
		//System.out.println("�����������"+period.getDays());
		long days=now.until(birthday,ChronoUnit.DAYS);
		System.out.println("�����ҵ����ջ��У�"+days);	
	}
}
