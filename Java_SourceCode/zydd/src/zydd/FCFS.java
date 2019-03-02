package zydd;

import java.util.*;

public class FCFS {
	public void run(List<zy> list) {
		Collections.sort(list,new zy());
		System.out.println("调度顺序为：");
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
        	System.out.println("作业"+list.get(i).getName()+": ");
        	System.out.print("完成时间:"+list.get(i).Finished+" ");
        	System.out.print("周转时间:"+list.get(i).turn+" ");
        	System.out.println("带权周转时间:"+list.get(i).Dqturn);
        }
        System.out.println("平均周转时间为:"+a);
        System.out.println("平均带权周转时间为："+b);
	}

}
