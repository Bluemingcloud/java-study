package day11.final_.field;

public class Person {
	
	/*
	 * final 이 붙은 변수는 직접 초기화 하거나, 생성자를 통해서 초기화 해야 한다.
	 */
	public final String nation = "대한민국";
	public final String ssn;
	public String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;			// 객체 생성시 초기값이 지정됨
		this.name = name;
	}
}
