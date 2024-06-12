package quizObject18;

public class UserVO {
	
	// 회원정보를 담기위한 클래스 -> 은닉, getter, setter
	private String name;
	private int age;
	
	public UserVO() {
	}
	
	public UserVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// getter / setter
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
}
