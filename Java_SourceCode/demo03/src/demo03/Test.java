package demo03;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student = new Student();
//		student.setName("张三");
//		student.setAge(20);
//		Student ss =student.copyStudent();
//		System.out.println(ss.toString());
//		System.out.println(ss.hashCode());
//		System.out.println(ss.getName());
//		System.out.println(ss.getAge());
//		System.out.println(ss==student);
//		System.out.println("equals方法返回值："+student.equals(ss));
//		
//		String s="张三";
//		String s2 = new String("张三");
//		System.out.println(s==s2);
//		System.out.println(s.equals(s2));
		
		Animal a1 = new Dog();
		a1.shout();
		Dog c1 = (Dog) a1;
		
//		a1.shout2();
		Animal a3 = new Cat();
		a3.shout();
		
		Animal a2= new Animal();
		a2.shout();
		Person p= new Person();
		p.w(new Dog());
		p.w(new Cat());
		
		Dog d = (Dog) new Animal();
	}

}
