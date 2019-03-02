package Bank2;
import java.util.Scanner;
import java.util.Arrays;

public class Banker {
	public   static int m,n;
	public   int AVAILABLE[];  
	public   int MAX[][] ;
	public   int ALLOCATION[][];; 
	public   int NEED[][];
	public   int Request[];
	public   int work [];
	public   boolean Finish [];
	public   int safeList [];

	public Banker() {
		Scanner sb=new Scanner(System.in);
		System.out.println("������˴�ģ����Դ�������:");
		n=sb.nextInt();
		System.out.println("������˴�ģ��Ľ�����:");
		m=sb.nextInt();
		AVAILABLE=new int[n];
		MAX=new int[m][n];
		ALLOCATION=new int[m][n];
		NEED=new int[m][n];
		Request=new int[n];
		work= new int[n];
		Finish=new boolean [m];
		safeList=new int[m];
		System.out.println("MAX:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("��"+(i+1)+"��������Ҫ"+(j+1)+"��Դ�������������");
				MAX[i][j]=sb.nextInt();
			}
			
		}
		System.out.println("ALLOCATION:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.println("��"+(i+1)+"�������ѷ���"+(j+1)+"��Դ������");
				ALLOCATION[i][j]=sb.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				NEED[i][j] =MAX[i][j]-ALLOCATION[i][j];
			}
		}
		
		System.out.println("AVAILABLE:");
		for(int i=0;i<n;i++) {
			System.out.println("��"+(i+1)+"����Դϵͳ��������Ŀ��");
			AVAILABLE[i]=sb.nextInt();
		}
	}
	
	
	public void display() {
		 System.out.println("AVAILABLE:");
		 for (int i = 0; i <n; i++) {  
	            System.out.print("��Դ" + (i+1) + "����:" + AVAILABLE[i] + " ");  
	        } 
		 System.out.println(); 
		 System.out.println("NEED:");
		 for (int i = 0; i < m; i++) {  
	            System.out.print("����" + (i+1)+ ":");  
	            for (int j = 0; j < n; j++) {  
	                System.out.print("��Դ" + (j+1) + "����:" + NEED[i][j] + " ");  
	            }  
	            System.out.println("");  
	     	} 
		 System.out.println("ALLOCATION:");  
	        for (int i = 0; i < m; i++) {  
	            System.out.print("����"+(i+1));  
	            for (int j = 0; j < n; j++) {  
	                System.out.print("��Դ" + (j+1) + "�ѷ�:" + ALLOCATION[i][j] + " ");  
	            }  
	            System.out.println(" ");  
	        }  
		 	 
	 }
	
	 public void run() {
		 Scanner sb=new Scanner(System.in);
		 int i,j;
		 while(true) {
				System.out.println("��ѡ��������Դ�Ľ��̺�(����0�˳�):");
			    i=sb.nextInt()-1;
			    if(i==-1) {
			    	System.exit(0);
			    }
			    for (j = 0; j < n; j++) {  
			    	System.out.println("��ѡ�����"+(i+1)+"����"+(j+1)+"����Դ����Ŀ:");
			    	Request[j] = sb.nextInt();  
	                if (Request[j] > NEED[i][j]) {  
	                    System.out.println("����" + (i+1) + "�������Դ�����ڽ�����������");
	                    break;  
	                } 
	                if (Request[j] > AVAILABLE[j]) {  
	                    System.out.println("����" +(i+1)+ "�������Դ������ϵͳ������"); 
	                    break;  
	                }  
	            } 
			    for ( j= 0; j< n; j++) {  
		            AVAILABLE[j] = AVAILABLE[j] - Request[j];  
		            ALLOCATION[i][j] = ALLOCATION[i][j] + Request[j];  
		            NEED[i][j] = NEED[i][j] - Request[j];  
		        }  
			    boolean B=safe();
		    	if(B==false) {
		    		for (j = 0; j < n; j++) {  
		                AVAILABLE[j] = AVAILABLE[j] + Request[j];  
		                ALLOCATION[i][j] = ALLOCATION[i][j] - Request[j];  
		                NEED[i][j] = NEED[i][j] + Request[j];  
		            }  
		    		System.out.println("ϵͳ����ȫ�ҳ������䣺"); 
		    	}
		    	else{ 
		    		System.out.println("ϵͳ��ȫ�Ұ�ȫ����Ϊ��"); 
		    		for( j=0;j<5;j++) {
		    			System.out.print((safeList[j]+1)+" ");
		    		}
		    		System.out.println("");
		    		display();
		    		OkFree(i);
		    	}      
		}	 
	 } 
	 
	 public boolean Compare(int i) {
		boolean B=true;
		for(int j=0;j<n;j++) {
			if(NEED[i][j]>work[j]) {
				B=false;
			}
			
		}
		return B;
	 } 
	 
	 public  void OkFree(int a) {  
	        int  count = 0;  
	        for (int j = 0; j < n; j++) {  
	            if (NEED[a][j] == 0)  
	                count++;  
	        }  
	        if (count == 3) {
	        	for (int i = 0; i < n; i++) {  
	                AVAILABLE[i] = AVAILABLE[i] + ALLOCATION[a][i];  
	                  
	            } 
	        }  
	         
	    } 
	 
	 public  boolean safe() {
		 work=Arrays.copyOf(AVAILABLE,n);
		 Arrays.fill(Finish,false);
		 int count=0;
		 int i=0;
		 while(i<m) {
			 if( (Finish [i]==false)&&Compare(i)) {
				 for(int j=0;j<n;j++) {
					 work[j]=work[j]+ALLOCATION[i][j];
				 }
				 Finish [i]=true;
				 safeList[count]=i;
				 count++;
				 i=0;	 
			 }else {
				 i++;
			 } 
		 }
		 for (i = 0; i < m; i++)  {
             if (Finish[i] == false) {  
            	 
                 return false;  
             }    
		 } 
		 return true;  
	 }
	 
	 public void BeginSafe() {
		 if(safe()) {
				System.out.println("T0ʱϵͳ���ڰ�ȫ״̬"); 
			}else {
				System.out.println("T0ʱϵͳ���ڲ���ȫ״̬���˳���");
				System.exit(0);
			}
		 
	 }
}
