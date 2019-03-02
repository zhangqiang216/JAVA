package one.msy;

public  class Person {
	private String name;
	
//	public Person() {
//		System.out.println("执行了Person父类的构造方法");
//	}
	public Person(String name) {
		System.out.println("执行了Person类的有参数的构造方法传递的参数是："+name);
	}
	public Person(String name,int age) {
		System.out.println("执行了Person类的有参数的构造方法传递的参数是："+name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//final方法不能被重写
	public  void display() {
		System.out.println("Person display 显示信息");
	}
}
