package one;

import one.msy.Person;

public class Teacher extends Person{
	public Teacher() {
		super("",9);
		System.out.println("����������Teacher�Ĺ��췽��");
	}
	public Teacher(String name) {
		super(name);
		System.out.println("����������Teacher���в����Ĺ��췽��");
	}
	public void display() {
		System.out.println("Teacher dispaly ��ʾ��Ϣ");
		super.setName("");
		super.display();
	}
	public void displayEx() {
		System.out.println("displayEx ��ʾ��Ϣ");
	}

}
