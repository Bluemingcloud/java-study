package day10.poly.basic2;

public class Employee extends Person{

	String department;
	
	Employee(String name, int age, String department) {
		super(name, age);
		// 아래 내용은 중복
//		this.name = name;
//		this.age = age;
		
		this.department = department;
	}
	
	String info() {
		
//		return "이름 : " + name + ", 나이 : " + age + ", 부서 : " + department;
		return super.info() + ", 부서 : " + department;
	}
}
