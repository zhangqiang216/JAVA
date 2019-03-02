package anthor;

import demo.Student;

public class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
//		stu1.name="张三";
		stu1.age=20;
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		stu1.study("数据库");
		stu1.study("JavaSE");
		Student stu2 = new Student("李四");
//		stu2.name="李四";
		stu2.age=21;
		stu2.study("Android开发",1);
		Student stu3= new Student("王五",22);
		int i=5;
		
		stu3.study(i);
		System.out.println("study调用后i的值是："+i);
		
		Student student = new Student("李某某",22);
		stu3.study(student);
		System.out.println(student.name);
	}

}
