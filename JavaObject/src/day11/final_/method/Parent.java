package day11.final_.method;

public /*final*/ class Parent { // final 클래스는 상속이 불가
	
	public final void method01() { // final 메서드는 오버라이딩 금지.
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01();				// 오버라이딩 금지라고 상속이 되지 않는것은 아니다.		
		
	}
}
