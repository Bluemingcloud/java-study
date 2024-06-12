package day11.abstract_.good;

public abstract class Store {
	
	/*
	 * 1. 추상 메서드는 abstract 를 붙이고, 반드시 자식에서 오버라이딩 하게된다.
	 * 2. 추상 메서드는 {} 가 없는 메서드이다.
	 * 3. 추상 메서드를 가지려면, 추상 클래스가 되어야 한다.
	 * 4. 추상 클래스는 객체로 생성할 수 없다.
	 * 		대신, 일반 멤버변수, 생성자, 일반 메서드 모두 가질 수 있다.
	 */
	private String name = "호식이 1 + 1 과일지점";
	
	public Store() {
		System.out.println("추상클래스의 생성자 호출");
	}
	
	// 몸체가 없는 추상적인 메서드 
	public abstract void melon();
	public abstract void apple();
	public abstract void orange();
	
	public final void mango() {
		System.out.println("본점에서만 판매하는 태국산 망고");
	}
	public String getName() {
		return "상호명 : " + name;
	}
}
