package Bank;
import java.util.Scanner;


public class Test {
	public static void main(String args[]) {
		Banker banker=new Banker();
		Scanner sb=new Scanner(System.in);
		banker.display();
		boolean A=true;
		int i=0;
		int j=0;
		while(banker.Flag) {
			System.out.println("请选择申请资源的进程号(0~4):");
		    i=sb.nextInt();
		   
		    for (j = 0; j < 3; j++) {  
		    	System.out.println("请选择进程"+i+"申请"+j+"号资源的数目:");
		    	Banker.Request[j] = sb.nextInt();  
                if (Banker.Request[j] > Banker.NEED[i][j]) {  
                    System.out.println("进程" + i + "申请的资源数大于进程" + i);
                    A=false;
                    break;  
                } 
                if (Banker.Request[j] > Banker.AVAILABLE[j]) {  
                        System.out.println("进程" + i + "申请的资源数大于系统可用" + j); 
                        A=false;
                        break;  
                }  
            } 
		    if(A) {
		    	banker.change(i);
		    	boolean B=banker.safe();
		    	if(B==false) {
		    		banker.rechange(i); 
		    	}
		    	else{ 
		    		System.out.println("系统安全且安全序列为："); 
		    		for(int m=0;m<5;m++) {
		    			System.out.print(banker.safeList[m]+"->");
		    		}
		    		System.out.println("");
		    		banker.display();
		    		banker.OkFree(i);
		    	}   
		    
        }  
			
	}

	}
}

