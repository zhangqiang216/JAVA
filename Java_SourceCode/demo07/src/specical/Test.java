package specical;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Triangle(1.0, 2.0, 5.0);
		} catch (SpecialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		int flag=1;		
		
		System.out.println("aaaaaaa");
		//assert flag==100:"flag �����������������";
		System.out.println("bbbbbbbbbbbb");
		
	}

}
