package zydd;

import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<zy> zylist = new ArrayList<zy>();
        Scanner sb = new Scanner(System.in);
        System.out.println("����������:");
        int n = sb.nextInt();
        System.out.println("������ҵ�� ����ʱ�� ����ʱ��");
        sb.nextLine();
        for (int i = 0; i < n; i++) {
        	String s = sb.nextLine();
            String[] ss = s.split(" ");
            zy z=new zy();
            z.setName(ss[0]);
            z.setArrivalTime(Integer.parseInt(ss[1]));
            z.setServiceTime(Integer.parseInt(ss[2]));
            zylist.add(z);
        }
        System.out.println("����FCFS��------------------------");
        FCFS f1=new FCFS();
        f1.run(zylist);
        System.out.println("����SJF��------------------------");
        SJF f2=new SJF();
        f2.run(zylist);


	}

}
