package day09.super_;

public class Student extends Person {

	String studentId;
	
	Student(String name, int age, String studentId) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.studentId = studentId;
	}
	
	String info() {
//		return "이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentId;
		return super.info() + ", 학번 : " + studentId;
	}
}
