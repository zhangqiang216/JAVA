
public class person {
	public void doWork(Object o,String ss) {
		Integer a =new Integer(ss);
		Integer b =Integer.valueOf(ss);
		System.out.println(o.toString());
		//ClassCastException 类强制转换
	}
}
