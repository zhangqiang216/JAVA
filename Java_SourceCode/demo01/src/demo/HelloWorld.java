package demo;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
	final int TEST_ONE=5;
	/**
	 * ������������������¼��
	 * 
	 * */
	public int method(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
		
	}
	public String  method2(int score) {
		String result="";
		switch (score/10) {
		case 10:
		case 9:
			 result="A";
			break;
		case 8:
		case 7:
			 result="B";
			break;
		case 6:
			 result="C";
			break;	

		default:
			 result="D";
			break;
		}
		return result;
	}
	public static void main(String[] args) {
//		byte b1=2;
//		int i1=b1;
//		byte b2=(byte)i1;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("����������a:");
//		int a = scanner.nextInt();
////		int a=10;
//		System.out.println("����������b:");
//		int b = scanner.nextInt();
////		int b=20;
		HelloWorld helloWorld = new HelloWorld();
//		int result = helloWorld.method(a, b);
//		System.out.println("a��b�нϴ�����ǣ�"+result);
//		
//		int s=50;
//		String result = helloWorld.method2(s);
//		System.out.println("�ɼ������ȼ���:"+result);
		//forѭ��
//		for(int i=0;i<10;i++) {
//			System.out.println("��"+i+"��ѭ��");
//		}
//		int ii=10;
//		int[] is= {1,2,3,4,5,6,7,8,9,10};
//		int[] is2= new int[10];
//		is2[0]=123;
//		for(int i=0;i<is2.length;i++) {
//			System.out.println(is2[i]);
//		}
//		for(int i:is) {
//			System.out.println(i);
//			i++;			
//		}
//		String[] ss= {"abc","bcd","cde"};
//		String[] ss2= new String[5];
//		ss2[0]="mengsy";
//		for(String s:ss2) {
//			System.out.println(s);
//		}
		
		int[][] iss= {{1,2},{2,3,4},{5,6,7,8,9},{1,2,3}};
		int[][] iss2= new int[5][];
		System.out.println(iss2[0]);
		int[] a= {1,2,3};
		iss2[0]= a;
//		iss2[0] = new int[2];
//		iss2[0][0]=3;
//		iss2[0][1]=5;
//		
//		iss2[1] = new int[4];
//		iss2[2] = new int[2];
//		iss2[3] = new int[1];
//		iss2[4] = new int[10];
		for(int i=0;i<iss.length;i++) {
			int[] js = iss[i];
			for(int j=0;j<js.length;j++) {
				System.out.println(js[j]);
			}
		}
		
		for(int[] js:iss) {
			for(int j:js) {
				System.out.println(j);
			}
		}
		
		int[] inta = {56,78,12};
		Arrays.sort(inta);
		System.out.println("���������飺");
		for(int ia:inta) {
			System.out.println(ia);
		}
		int[] copyOf = Arrays.copyOf(inta, 3);
//		int n=1;
//		int sum=0;
//		while(sum<1000) {
//			sum=sum+n*(n+1);
//			n++;
//		}
		
		
		
	}

}