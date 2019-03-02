package zydd;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SJF {
	public void run(List<zy> list) {
		Collections.sort(list,new zy());
		int length=list.size();
        double a;
        double b;
        List<zy> dai=new LinkedList<>();    
        List<zy> jie=new LinkedList<>(); 
        list.get(0).Finished=list.get(0).ServiceTime+list.get(0).ArrivalTime;
        list.get(0).turn=list.get(0).ServiceTime;
        list.get(0).Dqturn=(double)list.get(0).turn/(double)list.get(0).ServiceTime;
        int now=list.get(0).Finished;
        jie.add(list.get(0));
        for(int i=1;i<length;i++){  
            dai.add(list.get(i));  
        }  
        class Find{
        	public zy find(int now) {
        		zy next=dai.get(0);  
                int index=0;  
                for(int i=1;i<dai.size();i++){  
                    if(dai.get(i).ServiceTime<next.ServiceTime&&list.get(i).ArrivalTime<now){  
                        next=dai.get(i);  
                        index=i;  
                    }  
                }  
                dai.remove(index);  
                return next;  
        	}
        }
        Find fd=new Find();
        for(int i=1;i<length;i++){  
            zy next=fd.find(now);  
            if(next.ArrivalTime>now){  
            	list.get(i).Finished=next.ArrivalTime+next.ServiceTime;  
            	list.get(i).turn=next.ServiceTime;
            	list.get(i).Dqturn=(double)list.get(i).turn/(double)next.ServiceTime;
            }else{  
            	list.get(i).Finished=now+next.ServiceTime;  
            	list.get(i).turn=list.get(i).Finished-next.ArrivalTime;
            	list.get(i).Dqturn=(double)list.get(i).turn/(double)next.ServiceTime;
            }  
            now=list.get(i).Finished;  
            jie.add(next);  
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
        System.out.println("调度顺序为：");
        for (zy s : jie) {
            System.out.print(s.getName()+"  ");
        }
        System.out.println();
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
