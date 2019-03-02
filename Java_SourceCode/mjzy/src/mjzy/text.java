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
			System.out.println("第"+(i+1)+"名同学的英语成绩:");
			student[i].English=sb.nextInt();
			System.out.println("第"+(i+1)+"名同学的数学成绩:");
			student[i].Math=sb.nextInt();
			System.out.println("第"+(i+1)+"名同学的体育成绩:");
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
		System.out.println("A等级百分比为:"+(AE*10)+'%');
		System.out.println("B等级百分比为:"+(BE*10)+'%');
		System.out.println("C等级百分比为:"+(CE*10)+'%');
		System.out.println("D等级百分比为:"+(DE*10)+'%');

	}
		
	
}

