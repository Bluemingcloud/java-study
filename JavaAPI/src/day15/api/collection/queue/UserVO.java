package day15.api.collection.queue;

public class UserVO implements Comparable<UserVO> {
	
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
	
	@Override
	public int compareTo(UserVO o) {
		if(this.name.equals(o.getName())) {
			return this.age - o.getAge();
//			return Integer.compare(this.age, o.getAge());
		}
		return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + "]";
	}
	
}
