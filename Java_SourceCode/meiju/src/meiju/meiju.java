package meiju;

public class meiju {
	//��������̶���һ����Χ�ڵ�ֵ
	grade g;
	public String getP() {
		String result=null;
		switch(g) {
		case a:
			result="����";
			break;
			
		case b:
			result="����";
			break;
		case c:
			result="����";
			break;
			
		case d:
			result="����";
			break;
			
			
		case e:
			result="����";
			break;
			
		}
		return result;
	}
	public static void main(String args[]) {
		try {
			int i=10/0;
		}catch(ArithmeticException e) {
			System.out.println("AE");
			
		}
		
		
		
	}
	
	//Throwable-Error-Exception--���������--AWT����--����ʱ�쳣--��������쳣��������ʱ�쳣��
}//��ѧ�����쳣(��0)--��ָ���쳣-
//student s=null;
//s.setName();
//Խ���쳣
//�ļ�û�б��ҵ��쳣
//SQL�쳣
//�����쳣���׳��쳣;
