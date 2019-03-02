package zydd;

import java.util.*;

public class FCFS {
	public void run(List<zy> list) {
		Collections.sort(list,new zy());
		System.out.println("����˳��Ϊ��");
        for (zy s : list) {
            System.out.print(s.getName()+"  ");
        }
        System.out.println();
        int length=list.size();
        double a;
        double b;
        list.get(0).Finished=list.get(0).ServiceTime+list.get(0).ArrivalTime;
        list.get(0).turn=list.get(0).ServiceTime;
        list.get(0).Dqturn=(double)list.get(0).turn/(double)list.get(0).ServiceTime;
        int now=list.get(0).Finished;  
        for(int i=1;i<length;i++){  
            if(list.get(i).ArrivalTime>now){  
            	list.get(i).Finished=list.get(i).ArrivalTime+list.get(i).ServiceTime;  
            	list.get(i).turn=list.get(i).ServiceTime;
            	list.get(i).Dqturn=(double)list.get(i).turn/(double)list.get(i).ServiceTime;
            }else{  
            	list.get(i).Finished=now+list.get(i).ServiceTime;  
            	list.get(i).turn=list.get(i).Finished-list.get(i).ArrivalTime;
            	list.get(i).Dqturn=(double)list.get(i).turn/(double)list.get(i).ServiceTime;
            }  
            now=list.get(i).Finished;    
        }  
        double sum = 0;
        for(int i=0;i<length;i++) {
        	sum+=list.get(i).turn;
        }
        a=sum/(double)length;
        sum=0;
        for(int i=0;i<length;i++) {
        	sum+=list.get(i).Dqturn;
        }
        b=sum/(double)length;
        for(int i=0;i<length;i++) {
        	System.out.println("��ҵ"+list.get(i).getName()+": ");
        	System.out.print("���ʱ��:"+list.get(i).Finished+" ");
        	System.out.print("��תʱ��:"+list.get(i).turn+" ");
        	System.out.println("��Ȩ��תʱ��:"+list.get(i).Dqturn);
        }
        System.out.println("ƽ����תʱ��Ϊ:"+a);
        System.out.println("ƽ����Ȩ��תʱ��Ϊ��"+b);
	}

}
