package day13.api.lang.object;

public class Person implements Cloneable {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	// 메서드
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// obj 가 가지고 있는 이름이 같으면, true.
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if(p.getName().equals(this.name)) {
				return true;
			}
		}
		
		return false;
	}
	
	protected void method01() {
		System.out.println("프로텍티드 확인");
	}

	// toString 오버라이딩
	// 멤버변수의 값응ㄹ 한눈에 확인할 수 있도록 만든다.
	// generate toString
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	// clone() 메서드
	@Override
	protected Object clone() throws CloneNotSupportedException {	
		return super.clone();
	}
	
	// finallize() 메서드
	// @Deprecated(since = "9")
	// 버전 9 이상의 자바에서는 제대로 동작하지 않을 수 있으니 사용 지양
	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
		System.out.println("객체 소멸됨");
	}
	
	

}
