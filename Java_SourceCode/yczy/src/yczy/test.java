package yczy;

public class test {

	public static void main(String[] args) throws FullException, NullException {
		// TODO Auto-generated method stub
		Gun gun1=new Gun();
		Ball e1=new Ball();
		Ball e2=new Ball();
		Ball e3=new Ball();
		Ball e4=new Ball(2,"M77");
		Ball e5=new Ball();
		Ball e6=new Ball();
		Ball e7=new Ball();
		Ball e8=new Ball();
		Ball e9=new Ball();
		gun1.Load(e1);
		gun1.display();
		gun1.shot();
		gun1.display();
		//gun1.shot();
		gun1.Load(e2);
		gun1.Load(e3);
		gun1.Load(e4);
		gun1.Load(e5);

		
		gun1.Load(e6);
		gun1.Load(e7);
		gun1.Load(e8);
		gun1.Load(e9);
			

	}

}
