package org.edu2act.zq216qq.com.figure;

public class Rectangle {
	double w;
	double h;
	Rectangle(double a,double b){
		if(a>0&&b>0){
			w=a;
			h=b;
			System.out.println("创建成功");
			
		}else {
			System.out.println("矩形长宽错误");
		}
		
		
	}
	double perimeter()
	{
		double pm=2*(w+h);
		return pm;
		
	}
	double Area()
	{
		double A=w*h;
		return A;
		
	}
	

}
