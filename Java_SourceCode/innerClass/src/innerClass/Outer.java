package innerClass;

public class Outer {
	private String name;//��ΧΪ�ڲ�
	public void display() {
		System.out.println("A");
	}
	public class Inner{
		
	}//������Inner�ڵ�private,ֻ��Inner���Է��ʣ�ʵ��Ȩ�޸�С��Outer�޷����ʡ�������public
	//�ڲ�����Լ�static,private,protected
	//Outer outer=new Outer();
	Outer.Inner inner=new Outer().new Inner();
	//this.name;
	//Outer.this.name;����ͬ��

}
