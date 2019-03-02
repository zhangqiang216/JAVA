package zuoye2;

public class Person {
	String name;

	String department;

    int age;

    public Person(String n){

       name = n;

    }

    public Person(String n,int a){

       name =n;

       age = a;

    }

    public Person(String n,String d,int a){

       //doing the same as tow arguments version of constructor

       //including assignment name=n,age=a
    	this(n,a);
    	

       department = d;

    }

	

}


