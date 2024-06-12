package day11.inter.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		//Inter1 inter = new Inter1();
		Basic b = new Basic();
		
		System.out.println(Basic.PI);
		System.out.println(Basic.ABC);
		System.out.println(Inter1.PI);
		System.out.println(Inter2.ABC);
		
		b.method01();
		b.method02();
		b.method03();
		
		System.out.println("----------------------");
		
		/*
		 * 인터페이스도 다형성 처럼 부모 타입으로 사용할 수 있다.
		 * - 부모 타입에 있는 기능만 사용가능
		 * - 오버라이딩된 메서드는 먼저 실행
		 */
		Inter1 i1 = new Basic();
		i1.method01();
//		i1.method02();
		
		System.out.println("----------------------");
		
		/*
		 * 인터페이스도 클래스 캐스팅을 할 수 있다.
		 */
		Inter1 i2 = new Basic();
		Basic b2 = (Basic)i2;
		
		b2.method01();
		b2.method02();
		b2.method03();
		
	}

}
