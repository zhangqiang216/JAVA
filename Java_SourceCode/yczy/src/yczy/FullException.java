package yczy;

public class FullException extends Exception{

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("�ʧ�ܣ��쳣���ͣ�"+this.getClass().getName());
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "FullException�ʧ��";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�������쳣"+this.getClass().getName();
	}
	

}
