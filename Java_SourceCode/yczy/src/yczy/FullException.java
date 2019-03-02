package yczy;

public class FullException extends Exception{

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("Ìîµ¯Ê§°Ü£¬Òì³£ÀàĞÍ£º"+this.getClass().getName());
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "FullExceptionÌîµ¯Ê§°Ü";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "µ¯¼ĞÂúÒì³£"+this.getClass().getName();
	}
	

}
