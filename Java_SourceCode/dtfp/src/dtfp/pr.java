package dtfp;

import java.util.Comparator;



public class pr implements Comparable<pr>,Comparator<pr>{
	int ID;//�ѷ����б�ʾ���������������б�ʾ���п��        
    int startAddress;//��ʼ��ַ 
    int length;//����            
   
    public pr(int ID, int startAddress, int length) {
        super();
        this.ID = ID;
        this.startAddress = startAddress;
        this.length = length;
     
    }
    public pr() {
        super();
    }
	@Override
	public int compareTo(pr arg0) {
		// TODO Auto-generated method stub
		if(this.startAddress>arg0.startAddress) {
			return 1;
		}else {
			return -1;
		}
	}
	@Override
	public int compare(pr arg0, pr arg1) {
		// TODO Auto-generated method stub
		if(arg0.length>arg1.length) {
			return 1;
		}else {
			return -1;
		}
	}
	@Override
	public String toString() {
        return "pr: [ID=" + ID + ", startAddress=" + startAddress
                + ", length=" + length + "]";
    }
}
