package day08.overriding.basic2;

public class Person {
	
	//부모클래스 - 공통으로 사용될 기능
	String name;
	int age;
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}
