package anthor;

import demo.Student;

public class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
//		stu1.name="����";
		stu1.age=20;
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		stu1.study("���ݿ�");
		stu1.study("JavaSE");
		Student stu2 = new Student("����");
//		stu2.name="����";
		stu2.age=21;
		stu2.study("Android����",1);
		Student stu3= new Student("����",22);
		int i=5;
		
		stu3.study(i);
		System.out.println("study���ú�i��ֵ�ǣ�"+i);
		
		Student student = new Student("��ĳĳ",22);
		stu3.study(student);
		System.out.println(student.name);
	}

}
