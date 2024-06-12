package day10.poly.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01();
		c.method02();
		c.method03();
		System.out.println("---------------------------");
		
		// 다형성이 적용되면, 
		// 부모클래스에 있는 메서드만 사용할 수 있다.
		// 자식이 가진 본래 메서드에 접근할 수 없다.
		// 단, 오버라이딩 된 메서드는 먼저 실행된다.
		Parent p = c;
		p.method01();	// 상속 받은 메서드
		p.method02();	// 오버라이딩 된 메서드
//		p.method03();	// Parent 클래스에 존재하는 메서드만 사용가능
		System.out.println("---------------------------");
		
		// 주소값이 같음 = 자식 타입이 일시적으로 부모 타입으로 형변환
		System.out.println(c);
		System.out.println(p);
		System.out.println(c == p);
		System.out.println("---------------------------");
		
		
		/*
		 * 클래스 캐스팅 
		 * 
		 * 다형성이 적용된 객체는 클래스 캐스팅을 통해서 다시 자신으로 돌아올 수 있다.
		 * 
		 * 단, 다형성이 적용되지 않은 객체는 에러가 발생한다.
		 * 
		 */
		
		Parent pp = new Child();
		
		pp.method01();
		pp.method02();
//		pp.method03();	// 사용불가
		
		// 클래스 캐스팅
		Child cc = (Child)pp;
		
		cc.method01();
		cc.method02();
		cc.method03();	// 사용가능
		
		Parent ppp = new Parent();
		Child ccc = (Child)ppp;
		//Exception in thread "main" java.lang.ClassCastException: class day10.poly.basic.Parent cannot be cast to class day10.poly.basic.Child (day10.poly.basic.Parent and day10.poly.basic.Child are in module JavaObject of loader 'app')
		//at JavaObject/day10.poly.basic.MainClass.main(MainClass.java:53)
		// 런타임 에러 : 실행시 발생되는 에러

	}
}
