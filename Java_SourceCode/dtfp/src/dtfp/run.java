package dtfp;

import java.util.ArrayList;
import java.util.Collections;

public class run {
	 static ArrayList<pr> list1 = new ArrayList<>();    //空闲分区链表
	 static ArrayList<pr> list2 = new ArrayList<>(); 	//已分配给进程的分区链表
	 static {
		 list1.add(new pr(0,10,100));
	 }
	 static void bestFit(pr a){
		 if(list1.size()==0) {
			 System.out.println("内存不够分配！");
			 return;
		 }
		 Collections.sort(list1,new pr());
		 if(list1.get(0).length>=a.length) {
			 if(list1.get(0).length-a.length<=4) {
				 a.startAddress=list1.get(0).startAddress;
				 a.length=list1.get(0).length;
				 list1.remove(0);
				 list2.add(a);
				 
			 }else {
				 a.startAddress=list1.get(0).startAddress;
				 list1.get(0).startAddress=list1.get(0).startAddress+a.length;
				 list1.get(0).length-=a.length;
				 list2.add(a);
				 
			 }
		 }else if(list1.get(list1.size()-1).length<a.length) {
			 System.out.println("内存不够分配！");
			 
		 }else {
			 for(int i=0;i<list1.size()-1;i++) {
				 if(a.length>list1.get(i).length&&a.length<=list1.get(i+1).length) {
					 if(list1.get(i+1).length-a.length<=4) {
						 a.startAddress=list1.get(i=1).startAddress;
						 a.length=list1.get(i+1).length;
						 list2.add(a);
						 list1.remove(i+1);
						 break;
					 }else {
						 a.startAddress=list1.get(i+1).startAddress;
						 list1.get(i+1).startAddress=list1.get(i+1).startAddress+a.length;
						 list1.get(i+1).length-=a.length;
						 list2.add(a);
						 break;
				 }
			 }
			 
		 }
		 
		 }
		 for(int j=0;j<list1.size();j++) {//ID转number
			 list1.get(j).ID=j;
		 }
	 }
	 static void huishou(int id) {
		 Collections.sort(list1);
		 Collections.sort(list2);
		 int len1=list1.size();
		 int len2=list2.size();
		 int i;
		 for(i=0;i<len2;i++) {
			 if(list2.get(i).ID==id) {
				 break;
			 }
		 }
		 System.out.println(i);
		 if(i==len2) {
			 System.out.println("没有找到该进程!");
	         return;
		 }
		
		 list1.add(list2.remove(i));
		 Collections.sort(list1);
		 for(int j=0;j<list1.size()-1;j++) {//合并分区块
			 if(list1.get(j).startAddress+list1.get(j).length==list1.get(j+1).startAddress) {
				 list1.get(j).length+=list1.get(j+1).length;
				 list1.remove(j+1);
				 j--;
				 }
		 }
		 for(int j=0;j<list1.size();j++) {
			 list1.get(j).ID=j;
		 }
		 
	 }
	 void display() {
		 System.out.println("空闲分区表:");
		 for(int s=0;s<list1.size();s++) {
			 System.out.println("空闲块: [number=" + list1.get(s).ID + ", startAddress=" + list1.get(s).startAddress
		                + ", length=" + list1.get(s).length + "]");
		 }
		 System.out.println("已分配分区表:");
		 for(pr p2:list2) {
			 System.out.println(p2);
		 }
	 }
}
