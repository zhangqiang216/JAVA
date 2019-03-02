package org.edu2act.zq216qq.com.figure;

public class Exp0103Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(2);
		Circle c1=new Circle(-2);
		Rectangle r=new Rectangle(3,4);
		Rectangle r1=new Rectangle(-3,-4);
		Triangle t=new Triangle(3,4,5);
		Triangle t1=new Triangle(1,2,5);
		System.out.println(c.perimeter());
		System.out.println(c.Area());
		System.out.println(r.perimeter());
		System.out.println(r.Area());
		System.out.println(t.perimeter());
		System.out.println(t.Area());

	}

}
