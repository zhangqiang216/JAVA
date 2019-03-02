package yczy;

public class Gun {
	int Numbering;
	String Model;
	Clip clip=new Clip();
	int FullNumber;
	public Gun() {
		Numbering=1;
		Model="M54";
		FullNumber=6;
		
	}
	public Gun(int a,String b,int c) {
		Numbering=a;
		Model=b;
		
		FullNumber=c;
	}
	public void Load(Ball e) throws FullException{
		if(clip.num==FullNumber) {
			throw new  FullException();
		}
		
		if(e.getNumbering()==Numbering&&e.getModel()==Model) {
			clip.list.add(e);
			clip.num++;
		}
		else {
			System.out.println("◊”µØ”Î«π≤ª∆•≈‰");
		}
		
		
		
	}
	public void shot() throws NullException {
		if(clip.num==0) {
			throw new  NullException();
		}
		clip.num--;
		clip.list.remove(0);
	}
	
	public void display() {
		clip.display();
	

	}
}
