package demo04;

public class Person {
	static String name;
	static{
		name="XXXX";
		System.out.println("Person ��ľ�̬������ʼ��name����");
		
	}
	
	public   String getName() {
//		this.name="";
		return name;
	}
	public static void display(int i,String ...s) {
		System.out.println("person���еľ�̬����display");
//		getName();
	
	}
	

}
