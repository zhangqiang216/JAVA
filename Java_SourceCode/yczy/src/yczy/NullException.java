package yczy;

public class NullException extends Exception{
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("���ʧ�ܣ��쳣���ͣ�"+this.getClass().getName());
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "NullException���ʧ��";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���п��쳣"+this.getClass().getName();
	}
	

}
