package yczy;

public class Ball {
	private int Numbering;
	private String Model;
	public Ball() {
		Numbering=1;
		Model="M54";
	}
	public Ball(int a,String b) {
		Numbering=a;
		Model=b;
	}
	public int getNumbering() {
		return Numbering;
	}
	
	public String getModel() {
		return Model;
	}
	public void display() {
		System.out.println("子弹的编号为："+Numbering);
		System.out.println("子弹的型号为："+Model);
		
	}

}
