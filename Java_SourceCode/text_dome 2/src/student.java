
public class student {
	/*public student() {
		
	}*/
	public student(String name) {
		this.name=name;
		
	}
	String name;//默认null
	int age;//默认0
	void study(String course){
		System.out.println(this.name+"学习"+course);
		
		
	};
	
	//方法只能写在类里面，必须属于一个类，java是纯面向对象的语言
	//private 只能类内也
	//protected 与默认在子类中访问权限不一样
	//同一个类内，方法名相同，参数列表不同，返回值不作为重载依据，是否静态，类型 个数 顺序

}
