package zuoye3;
import java.util.*;

public class zy3 {
	public static void main(String[] args) {
		
		/*for(int i=1;i<=9;i++)
		{
			for(int j=i;j<=9;j++)
			{
				
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println("");
		}
		
		
		for(int i=1;i<=9;i++)
		{
			int n=i;
			while(n<9)
			{
				System.out.print("     "+"\t");
				n++;
				
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println("");
		}*/
		Scanner sb=new Scanner(System.in);
		System.out.println("请输入最大的整数:");
		int a=sb.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a-i;j++)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=i;m++)
			{
				System.out.print(m+" ");
			}
			System.out.println("");
		}
		for(int i=a-1;i>=1;i--)
		{
			for(int m=1;m<=a-i;m++)
			{
				System.out.print(" ");
			}
			for(int n=1;n<=i;n++)
			{
				System.out.print(n+" ");
				
			}
			System.out.println("");
			
		}
		
		
		sb.close();
	}
	

}
