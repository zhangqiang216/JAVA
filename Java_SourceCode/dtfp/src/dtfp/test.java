package dtfp;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sb=new Scanner(System.in);
		int id;
		run r=new run();
		int choice;
		 System.out.println("���ű��ʼ״̬��");
		 r.display();
		 System.out.println("NULL");
		while(true) {
			
			 System.out.println("��ѡ�������");
			 System.out.println("1.�ڴ���䣨�����Ӧ�㷨��");
	         System.out.println("2.�ڴ����");
	         System.out.println("3.�˳�");
	         choice=sb.nextInt();
	         switch(choice) {
	         case 1:
	        	 pr p=new pr();
	        	 System.out.println("�������ID ����");
	             sb.nextLine();
	             String s = sb.nextLine();
	             String[] ss = s.split(" ");
	             p.ID=Integer.parseInt(ss[0]);
	             p.length=Integer.parseInt(ss[1]);
	             r.bestFit(p);
	             r.display();
	             break;
	         case 2:
	        	 System.out.println("������ս���ID");
	        	 id =sb.nextInt();
	        	 r.huishou(id);
	        	 r.display();
	        	 break;
	         case 3:
	        	 System.out.println("���˳�");
	        	 System.exit(0);
	             } 
	         }
		}

}


