package zuoye1;
import java.util.*;

public class zy1 {
	public int sum(int a,int b) {
		int n=0;
		for(int i=a;i<=b;i++)
		{
			n=n+i;
			
		}
		return n;
	}
	public int cum(int a)
	{
		int m=0;
		int n=1;
		while(m<a)
		{
			m+=+n*(n+1);
			n++;
		}
		return n-1;
	}
	public int cum2(int a)
	{
		int m=0;
		int n=1;
		do {
			m+=n*(n+1);
			n=n+1;
		}while(m<a);
		return n-1;
	}
	
	public static void main(String[] args)
	{
		/*zy1 zy=new zy1();
		
		Scanner sb=new Scanner(System.in);
		System.out.println("请输入开头的整数:");
		int a=sb.nextInt();
		System.out.println("请输入末尾的整数:");
		int b=sb.nextInt();
		int sum=zy.sum(a,b);
		System.out.println("和为："+sum);*/
		
		/*zy1 zy=new zy1();
		int n=zy.cum(1000);
		System.out.println("n的最大值为："+n);*/
		/*
		zy1 zy=new zy1();
		int n=zy.cum2(1000);
		System.out.println("n的最大值为："+n);
		*/
		
		
		
		
		
		
	}

}
