package innerClass;

public class Outer {
	private String name;//范围为内部
	public void display() {
		System.out.println("A");
	}
	public class Inner{
		
	}//定义在Inner内的private,只有Inner可以访问，实现权限更小，Outer无法访问。除非是public
	//内部类可以加static,private,protected
	//Outer outer=new Outer();
	Outer.Inner inner=new Outer().new Inner();
	//this.name;
	//Outer.this.name;内外同名

}
