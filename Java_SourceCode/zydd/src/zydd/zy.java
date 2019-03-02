package zydd;

import java.util.Comparator;

public class zy implements Comparator<zy>{
	String name;
    int ArrivalTime;    
    int ServiceTime;
    int Finished;
    int turn;
    double Dqturn;
	public void setName(String name) {
		this.name = name;
	}
	public void setArrivalTime(int arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	public void setServiceTime(int serviceTime) {
		ServiceTime = serviceTime;
	}
	@Override
	public int compare(zy arg0, zy arg1) {
		// TODO Auto-generated method stub
		if(arg0.ArrivalTime!=arg1.ArrivalTime) {
			return arg0.ArrivalTime>arg1.ArrivalTime? 1:-1;
		}else {
			return arg0.ServiceTime>arg1.ServiceTime? 1:-1;
		}
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
