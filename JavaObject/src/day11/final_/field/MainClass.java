package day11.final_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("123123", "홍길동");
		System.out.println(p1.nation);
//		p1.nation = "미국인"; // final이 변수에 붙으면 값 변경 금지.
		System.out.println(p1.ssn);

		Person p2 = new Person("333333", "이순신");
		System.out.println(p2.ssn); // final 변수는 객체마다 서로 다른 값을 가질 수 있다.
		
		
		// 지역변수에 final
//		final int a = 1;
//		a = 2;	// final 이 붙은 변수는 대입 불가능.
		
		System.out.println("-------------------------");
		
		// 상수의 사용
		System.out.println(Constant.PI);
		System.out.println(Constant.EARTH_RADIUS);
		System.out.println(Constant.VERSION);
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);		
		
	}
}
