package one.msy;

public  class Person {
	private String name;
	
//	public Person() {
//		System.out.println("ִ����Person����Ĺ��췽��");
//	}
	public Person(String name) {
		System.out.println("ִ����Person����в����Ĺ��췽�����ݵĲ����ǣ�"+name);
	}
	public Person(String name,int age) {
		System.out.println("ִ����Person����в����Ĺ��췽�����ݵĲ����ǣ�"+name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//final�������ܱ���д
	public  void display() {
		System.out.println("Person display ��ʾ��Ϣ");
	}
}
