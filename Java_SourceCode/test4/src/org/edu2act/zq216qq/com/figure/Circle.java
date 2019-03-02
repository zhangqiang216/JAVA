package org.edu2act.zq216qq.com.figure;

public class Circle {
	double r;
	Circle(double a){
		if(a>0) {
			r=a;
			System.out.println("创建成功");
		}
		else {
			System.out.println("圆半径值有误");
		}
		
	}
	double perimeter()
	{
		double pm=2*3.14*r;
		return pm;
	}
	double Area()
	{
		double A=r*r*3.14;
		return A;
	}

}
