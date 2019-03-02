package dtfp;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sb=new Scanner(System.in);
		int id;
		run r=new run();
		int choice;
		 System.out.println("两张表初始状态：");
		 r.display();
		 System.out.println("NULL");
		while(true) {
			
			 System.out.println("请选择操作：");
			 System.out.println("1.内存分配（最佳适应算法）");
	         System.out.println("2.内存回收");
	         System.out.println("3.退出");
	         choice=sb.nextInt();
	         switch(choice) {
	         case 1:
	        	 pr p=new pr();
	        	 System.out.println("输入进程ID 长度");
	             sb.nextLine();
	             String s = sb.nextLine();
	             String[] ss = s.split(" ");
	             p.ID=Integer.parseInt(ss[0]);
	             p.length=Integer.parseInt(ss[1]);
	             r.bestFit(p);
	             r.display();
	             break;
	         case 2:
	        	 System.out.println("输入回收进程ID");
	        	 id =sb.nextInt();
	        	 r.huishou(id);
	        	 r.display();
	        	 break;
	         case 3:
	        	 System.out.println("已退出");
	        	 System.exit(0);
	             } 
	         }
		}

}


