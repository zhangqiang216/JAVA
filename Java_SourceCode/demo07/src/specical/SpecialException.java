package specical;

public class SpecialException extends Exception {
	private static final long serialVersionUID = 1L;
	@Override
	public String getMessage() {
		return "SpecialException�����ι���ʧ��";
	}
	@Override
	public void printStackTrace() {
		super.printStackTrace();
		
		System.out.println("�����ι���ʧ�ܣ��쳣���ͣ�"+this.getClass().getName());
	}
	@Override
	public String toString() {
		return "�����ι����쳣������Ϊ��"+this.getClass().getName();
	}

}
