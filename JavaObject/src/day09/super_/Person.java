package day09.super_;

public class Person extends Object {
	
	String name;
	int age;
	
	//생성자
//	Person() {
//		this("이름없음",1);		
//		//System.out.println("나의 이름은? : " + this);
//	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
//		System.out.println("매개변수 name, age 를 받는 생성자");
	}
	
	Person(String name) {
		this(name, 1);
		// Person(String name, int age) 생성자에 
		// this.name 과 1을 넣은 객체를 호출한 것
	}
	
	Person(int age) {
		this("이름없음", age);
		// Person(String name, int age) 생성자에 
		// "이름없음" 과 age 를 넣은 객체를 호출한 것
	}
	
	Person(int age, String name) {
		this(name, age);
		// 서로 바뀐 것도 가능
	}
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}
