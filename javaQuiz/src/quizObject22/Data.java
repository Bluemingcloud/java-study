package quizObject22;

public class Data {
	
	private String name;
	private int age;
	private String eMail;
	private String direction;
	
	public Data() {
	}

	public Data(String name, int age, String eMail, String direction) {
		super();
		this.name = name;
		this.age = age;
		this.eMail = eMail;
		this.direction = direction;
	}

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
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	

}
