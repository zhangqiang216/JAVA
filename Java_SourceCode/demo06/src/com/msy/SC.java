package com.msy;

public class SC {
	private Student student;
	private Course course;
	private Grade grade= Grade.A;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	public String getP() {
		String result = null;
		switch (grade) {
		case A:
			result="�ɼ�����";
			break;
		case B:
			result="�ɼ�����";
			break;
		case C:
			result="�ɼ��е�";
			break;
		case D:
			result="�ɼ�����";
			break;
		case E:
			result="�ɼ���";
			break;
		default:
			break;
		}
		return result;
	}
	
}
