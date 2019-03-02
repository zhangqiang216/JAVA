package qizhong;

import java.util.*;
import java.util.Map.Entry;

public class a {
	public static void aa(int[] is) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<is.length;i++) {
			if(map.get(is[i])==null){
				map.put(is[i],0);
			}else {
				map.put(is[i], map.get(is[i])+1);
			}
		}
		Set<Integer> keySet=map.keySet();
		for(int key:keySet) {
			Integer value=map.get(key);
			System.out.println(value);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] aa= {1,3,2,5,4,3,4,5,7,7,7,7,7};
		//aa(aa);
		
//		Set<String> name = new HashSet<String>();
//		name.add("LL");
//		name.add("VV");
//		name.add("WW");
//		Iterator<String> it = name.iterator();
//		while(it.hasNext()){
//			String n = it.next();
//			System.out.println(n);
//		}
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "LL");
		map.put(2, "LW");
		map.remove(2);
		Iterator it=map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry m = (Entry) it.next();
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		 
	}

}
