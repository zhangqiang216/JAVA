
public class dome2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实际对象——抽象——类——实例化对象——访问属性与方法
		student stu1=new student("zhangsan");
		stu1.name="张三";
		stu1.age=20;
		stu1.study("javaSE");
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		//类的引用传递会改变
		//值传递不变


	}

}
