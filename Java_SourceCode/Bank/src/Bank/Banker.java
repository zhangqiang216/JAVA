package Bank;
import java.util.Arrays;

public class Banker {
	public static int AVAILABLE[] = { 3, 3, 2 };  
	public static int MAX[][] = { { 7, 5, 3 }, { 3, 2, 2 }, { 9, 0, 2 }, { 2, 2, 2 }, { 4, 3, 3 } };  
	public static int ALLOCATION[][]={ { 0, 1, 0 }, { 2, 0, 0 }, { 3, 0, 2 },  { 2, 1, 1 }, { 0, 0, 2 } }; 
	public static int NEED[][] = { { 7, 4, 3 }, { 1, 2, 2 }, { 6, 0, 0},  { 0, 1, 1}, { 4, 3, 1 } }; 
	public static int Request[] = { 0, 0, 0 };
	int safeList []=new int[5];
	public boolean Flag=true;
	public void display() {
		 System.out.println("AVAILABLE:");
		 for (int i = 0; i <3; i++) {  
	            System.out.print("资源" + i + "可用:" + AVAILABLE[i] + " ");  
	        } 
		 System.out.println(); 
		 System.out.println("NEED:");
		 for (int i = 0; i < 5; i++) {  
	            System.out.print("进程" + i + ":");  
	            for (int j = 0; j < 3; j++) {  
	                System.out.print("资源" + j + "还需:" + NEED[i][j] + " ");  
	            }  
	            System.out.println("");  
	     	} 
		 System.out.println("ALLOCATION:");  
	        for (int i = 0; i < 5; i++) {  
	            System.out.print("进程");  
	            System.out.print(i);  
	            for (int j = 0; j < 3; j++) {  
	                System.out.print("资源" + j + "已分:" + ALLOCATION[i][j] + " ");  
	            }  
	            System.out.println(" ");  
	        }  
		 	 
	 }
	public  void change(int a) {  
        int j;  
        for (j = 0; j < 3; j++) {  
            AVAILABLE[j] = AVAILABLE[j] - Request[j];  
            ALLOCATION[a][j] = ALLOCATION[a][j] + Request[j];  
            NEED[a][j] = NEED[a][j] - Request[j];  
        }  
    }
	public  void rechange(int a) {  
        int j;  
        for (j = 0; j < 3; j++) {  
            AVAILABLE[j] = AVAILABLE[j] + Request[j];  
            ALLOCATION[a][j] = ALLOCATION[a][j] - Request[j];  
            NEED[a][j] = NEED[a][j] + Request[j];  
        }  
    }
	/*public  void free(int a) {  
        for (int j = 0; j < 3; j++) {  
            AVAILABLE[j] = AVAILABLE[j] + ALLOCATION[a][j];  
              
        }  
    }*/  
	public  void OkFree(int a) {  
        int  n = 0;  
        for (int j = 0; j < 3; j++) {  
            if (NEED[a][j] == 0)  
                n++;  
        }  
        if (n == 3) {
        	for (int i = 0; i < 3; i++) {  
                AVAILABLE[i] = AVAILABLE[i] + ALLOCATION[a][i];  
                  
            } 
        }  
         
    } 
	 public  boolean safe() {
		 int [] work=Arrays.copyOf(AVAILABLE,3);
		 boolean Finish [] = new boolean [5];
		 Arrays.fill(Finish,false);
		 int count=0;
		 int i=0;
		 while(i<5) {
			 if( Finish [i]==false&&NEED[i][0]<=work[0]&&NEED[i][1]<=work[1]&&NEED[i][2]<=work[2]) {
				 
				 for(int j=0;j<3;j++) {
					 work[j]=work[j]+ALLOCATION[i][j];
				 }
				 Finish [i]=true;
				 safeList[count]=i;
				 count++;
				 i=0;
				 
			 }
			 else {
				 i++;
			 }
			 
		 }
		 for (i = 0; i < 5; i++)  {
             if (Finish[i] == false) {  
                 System.out.println("系统处于不安全状态不分配");  
                 Flag=false;
                 return false;  
             }    
		 } 
		 return true;  
	 }
	 
}
