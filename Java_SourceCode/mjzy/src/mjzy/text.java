package mjzy;
import java.util.*;

public class text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] student= {new Student(),new Student(),new Student(),new Student(),new Student(),new Student(),new Student(),new Student(),new Student(),new Student(),};
		Scanner sb=new Scanner(System.in);
		int AE=0;
		int BE=0;
		int CE=0;
		int DE=0;
		for(int i=0;i<student.length;i++) {
			System.out.println("��"+(i+1)+"��ͬѧ��Ӣ��ɼ�:");
			student[i].English=sb.nextInt();
			System.out.println("��"+(i+1)+"��ͬѧ����ѧ�ɼ�:");
			student[i].Math=sb.nextInt();
			System.out.println("��"+(i+1)+"��ͬѧ�������ɼ�:");
			student[i].Physical=sb.nextInt();
			student[i].setGrade();
			System.out.println(student[i].grade);
				
		}
		for(Student s:student) {
			switch(s.grade) {
			case A:
				AE++;
				break;
			case B:
				BE++;
				break;
			case C:
				CE++;
				break;
			case D:
				DE++;
				break;
				
			}
		
			
		}
		System.out.println("A�ȼ��ٷֱ�Ϊ:"+(AE*10)+'%');
		System.out.println("B�ȼ��ٷֱ�Ϊ:"+(BE*10)+'%');
		System.out.println("C�ȼ��ٷֱ�Ϊ:"+(CE*10)+'%');
		System.out.println("D�ȼ��ٷֱ�Ϊ:"+(DE*10)+'%');

	}
		
	
}

