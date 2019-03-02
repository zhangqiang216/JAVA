package zuoye2;
import java.util.Scanner;

public class CheckLeapYear {
	void DS(int year)
	{
		if((year%4==0&&year%100!=0)||(year%400==0))
		{
			System.out.println(year+"年是闰年");
		}else{
			System.out.println(year+"年是平年");
			
		}
	}
	public static void main(String[] args)
	{
		Scanner sb=new Scanner(System.in);
		System.out.println("请输入一个年份:");
		int yearInPut=sb.nextInt();
		CheckLeapYear cly=new CheckLeapYear();
		cly.DS(yearInPut);
		
		
	}
	
}
