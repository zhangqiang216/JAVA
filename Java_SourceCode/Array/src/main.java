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
		//������ArrayListЧ�ʸ�֮vocter
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
		set.add("a");//�ظ���add
		//������������HashSet,Ȼ��get;
		System.out.println(set);//System.out.println(set.toString()); Set �� toString ��д��
		//��� ��a,b,c��
		//�����ظ��洢equals��ͬ�ģ��Ƿ�Ϊtrue;
		//equals���� ==(��ַ)
		String s1="a";
		String s2="a";
		//== false
		//equals true
		//Ȼ����HashSet��studentĬ�ϵ���Object��equals����δ��д������==�������Ҫ��д��
	}

}
