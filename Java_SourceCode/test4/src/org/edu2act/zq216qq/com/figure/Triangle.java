package org.edu2act.zq216qq.com.figure;

public class Triangle {
	double a;
	double b;
	double c;
	Triangle(double a,double b,double c){
		if(a>0&&b>0&&c>0&&(a+b)>c&&(b+c)>a&&(a+c)>b){
			this.a=a;
			this.b=b;
			this.c=c;
			System.out.println("创建成功");
			
		}else {
			System.out.println("三角形三边不符合条件");
		}
		
		
	}
	double perimeter()
	{
		double pm=a+b+c;
		return pm;
	}
	double Area()
	{
		double p=(a+b+c)/2;
		double A=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return A;
	}

}
