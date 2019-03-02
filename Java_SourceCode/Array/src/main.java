import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("mengsy");
		for(int i=0;i<10;i++) {
			list.add("mengsy"+i);
		}
		list.get(10);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(Math.sqrt(100));
		//并发大。ArrayList效率高之vocter
		List list2=new LinkedList();
		list2.add("mengsy");
		for(int i=0;i<10;i++) {
			list2.add("mengsy"+i);
		}
		list2.get(10);
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}

		Set set=new HashSet();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("a");//重复不add
		//迭代器遍历，HashSet,然后get;
		System.out.println(set);//System.out.println(set.toString()); Set 中 toString 重写了
		//结果 【a,b,c】
		//不能重复存储equals相同的，是否为true;
		//equals（） ==(地址)
		String s1="a";
		String s2="a";
		//== false
		//equals true
		//然而在HashSet中student默认的是Object的equals，（未重写）返回==结果，需要重写；
	}

}
