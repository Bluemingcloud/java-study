package quizObject09;

public class User {
	// private 변수 생성
	private String name;
	private int rrn;
	private int age;
	
	// 기본 생성자, 초기화 생성자 생성
	public User() {
	}
	public User(String name, int rrn, int age) {
		super();
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}

	// getter / setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getRrn() {
		return rrn;
	}
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

