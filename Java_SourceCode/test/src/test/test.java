package test;


import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new LinkedList();
		
		
		for(int i=0;i<3;i++) {
			list.add("mengsy"+i);
		}
		list.add(3,"hao");
		((LinkedList) list).removeFirst();
		System.out.println(list.toString());
		int index=((LinkedList) list).indexOf("hao");
		System.out.println(index);
		List list2=list.subList(0, 2);//ÁôÍ·²»ÁôÎ²
		//list2.clear();
		System.out.println(list2);
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Hello");
		queue.offer("World!");
		queue.offer("ÄãºÃ£¡");
		System.out.println(queue.size());
		String str;
		while((str=queue.poll())!=null){
		System.out.print(str);
		}
		System.out.println();
		System.out.println(queue.size());
		
	}

}
