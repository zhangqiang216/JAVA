package demo03;

public class Student {
	
	private  String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student copyStudent() {
		Student obj =null;
			try {
				obj = this.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return obj;
	}

	@Override
	protected Student clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		    Student student = new Student();
		    student.setName(this.getName());
		    student.setAge(this.getAge());
		return student;
	}

	@Override
	public boolean equals(Object po) {
		// TODO Auto-generated method stub
		 if(po instanceof Student) {
			Student student = (Student)po;
			if(student.getName().equals(this.getName()) && student.getAge()==this.getAge()) {
				return true;	
			}else {
				return false;
			}
		 }else {
			 return false;
		 }
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName()+":"+this.getAge();
	}
	
	

}
