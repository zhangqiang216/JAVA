package meiju;

public class meiju {
	//对象个数固定，一定范围内的值
	grade g;
	public String getP() {
		String result=null;
		switch(g) {
		case a:
			result="优秀";
			break;
			
		case b:
			result="优秀";
			break;
		case c:
			result="优秀";
			break;
			
		case d:
			result="优秀";
			break;
			
			
		case e:
			result="优秀";
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
	
	//Throwable-Error-Exception--虚拟机错误--AWT错误--运行时异常--输入输出异常（非运行时异常）
}//数学运算异常(除0)--空指针异常-
//student s=null;
//s.setName();
//越界异常
//文件没有被找到异常
//SQL异常
//捕获异常，抛出异常;
