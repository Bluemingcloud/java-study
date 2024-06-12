package quizObject01;

public class Person {
	
	String name;
	int age;
	int tall;
	
	// 기본 생성자 도 만들어야한다.
	Person() {
	}
	
	Person(String pName, int pAge, int pTall) {
		age = pAge;
		name = pName;
		tall = pTall;
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age + "세");
		System.out.println("키: " + tall);
	}
	
}
