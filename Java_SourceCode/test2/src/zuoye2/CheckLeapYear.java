package zuoye2;
import java.util.Scanner;

public class CheckLeapYear {
	void DS(int year)
	{
		if((year%4==0&&year%100!=0)||(year%400==0))
		{
			System.out.println(year+"��������");
		}else{
			System.out.println(year+"����ƽ��");
			
		}
	}
	public static void main(String[] args)
	{
		Scanner sb=new Scanner(System.in);
		System.out.println("������һ�����:");
		int yearInPut=sb.nextInt();
		CheckLeapYear cly=new CheckLeapYear();
		cly.DS(yearInPut);
		
		
	}
	
}
