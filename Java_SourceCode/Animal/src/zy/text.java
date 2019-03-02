package zy;

public class text {
	public static void main(String args[]) {
		
		Food fish=new Food("”„");
		Food meat=new Food("»‚");
		Food banana=new Food("œ„Ω∂");
		Animal cat=new Cat();
		Animal dog=new Dog();
		Animal elephant=new Elephant();
		Person person=new Person();
		person.feed(cat,fish);
		person.feed(dog,meat);
		person.feed(elephant,banana);
	}		

}
