package demo;

import java.util.HashSet;
import java.util.Set;

public class Student {
	public String name;
	public int age;
	public Student() {
		
	}
	public Student(String name) {
		this.name=name;
	}
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String study(String course) {
		System.out.println(this.name+" 在学习"+" ，学习的内容是"+course);
	  return "学习完成";
	}
	public String study(String course,int time) {
		System.out.println(this.name+" 在学习"+" ，学习的内容是"+course);
	  return "学习完成";
	}
	
	public void study(int time,String course) {
		//调用重载的study方法
		study(course,time);
	}
	
	public void study(int i) {
		i=i+1;
		System.out.println(i);
	}
	public void study(Student s) {
		s.name="改后的名字";
		System.out.println(s.name);
	}
	String a="12dd";
	int b=a.length();
	
	//list2.add(new student());打印用tostring 方法；
	
	
	

}
