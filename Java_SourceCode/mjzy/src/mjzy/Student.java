package mjzy;

public class Student {
	String name;
	int English;
	int Math;
	int Physical;
	Grade grade;
	void setGrade() {
		int average=(English+Math+Physical)/3;
		switch(average/10) {
		case 10:
		case 9:
			grade=Grade.A;
			break;
			
		case 8:
			grade=Grade.B;
			break;
		case 7:
		case 6:
			grade=Grade.C;
			break;
			
		default:
			grade=Grade.D;
			break;
			
		}

	}
}
