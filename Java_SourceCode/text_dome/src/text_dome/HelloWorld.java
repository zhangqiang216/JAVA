package text_dome;

import java.util.Arrays;

public class HelloWorld {
	public int method(int a,int b)
	{
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("HelloWorld1");
		int a=10;
		int b=3;
		System.out.println(a/b);
		boolean b1=true;
		boolean b2=false;
		System.out.println(b2&&b1);
		int i=b2?2:3;
		System.out.println(i);
		String s1="meng";
		String s2="ying";
		System.out.println(s1+s2);
		i++;
		System.out.println(s1 instanceof String);		
		int m=10;
		int n=20;
		if(a>b)
		{
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		int s=89;
		switch(s/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
		case 7:
			System.out.println("B");
			break;
		default:
			System.out.println("D");
			break;
		
		
		}*/
		/*HelloWorld helloworld=new HelloWorld();
		//for循环
	
		for(int i2=0;i2<10;i2++) {
			System.out.println(i2);
		}*/
		/*int[] is= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<is.length;i++)
		{
			System.out.println(is[i]);
			
			
		}
		for(int i:is)
		{
			System.out.println(i);
			i++;//数组内值不变，仅仅是复制
			
		}
		final int a=100;
		String[] ss= {"abc","bcd","cde"};
		for(String s:ss)
		{
			System.out.println(s);
		}*/
		//静态初始化
		//int[] a= {1,2,3,4};
		//动态初始化
		//int[] is2=new int[10];
		//String[] ss2=new String[5];
		//ss2[0]="";
		//System.out.println(ss2[0]);//null
		//System.out.println(ss2.length);
		//二维数组
		/*int [][] iss= {{1,2},{2,3,4},{5,6,7,8,9},{1,2,3}};
		System.out.println(iss[0][0]);
		for(int i=0;i<iss.length;i++)//一维长度0,1,2,3
		{
			int[] js=iss[i];
			for(int j=0;j<js.length;j++)
			{
				System.out.println(js[j]);
			}
		}
		for(int[] js:iss) {
			for(int j:js)
			{
				System.out.println(j);
				
			}
		}*/
		//动态二维
		/*int[][] iss2=new int[5][];
		System.out.println(iss2[0]);//null,一维和二维都得初始化；
		iss2[0]=new int[2];
		iss2[1]=new int[4];
		iss2[2]=new int[4];
		iss2[3]=new int[4];
		iss2[4]=new int[4];
		int[] a= {1,2,3};
		iss2[0]=a;//iss2[0]是指针，只能赋值*/
		//Arrays 类
		
		int[] inta= {56,78,12};
		int[] f=Arrays.copyOf(inta, 10);//被截断，或0填充
		Arrays.sort(inta);//原来基础上
		
		
		
		
		
		
		
		
	
		
	
		

	}

}
