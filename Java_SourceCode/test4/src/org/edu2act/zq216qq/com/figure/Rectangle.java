package org.edu2act.zq216qq.com.figure;

public class Rectangle {
	double w;
	double h;
	Rectangle(double a,double b){
		if(a>0&&b>0){
			w=a;
			h=b;
			System.out.println("�����ɹ�");
			
		}else {
			System.out.println("���γ������");
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
