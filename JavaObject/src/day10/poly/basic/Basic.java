package day10.poly.basic;
/*
 *  하나의 클래스 파일에는 여러 클래스 선언이 가능하다.
 *  단, 파일명과 동일한 클래스가 있어야 하고,
 *  해당 클래스만 public 이어야 한다.
 *  
 *  예시로 사용하기 위해 쓰는것. 잘 사용하지 않는 방법이다.
 */
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}


public class Basic {
	
	int x = 1;
	double y = x;
	
	// 멤버변수
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	// A 의 자식클래스 : B, C, D, E
	A a1 = b;	// B -> A 클래스 형변환
	A a2 = new B();
	A a3 = new C();
	A a4 = new D();
	A a5 = new E();
	
	// 상속 관계가 없으면 다형성이 불가능
//	B b1 = new E();
	
	// Object 클래스는 모든 클래스를 담을 수 있다.
	// Object 타입은 꼭 필요할 때만 사용
	Object o1 = a;
	Object o2 = 3.14;
	Object o3 = "홍길동";
	Object o4 = new B();
}
