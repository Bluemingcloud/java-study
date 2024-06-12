package day10.static_.field;

public class MainClass {
	public static void main(String[] args) {
		
		Count c = new Count();
		c.a++;
		c.b++;
		
		System.out.println("일반변수 : " + c.a);	// 1
		System.out.println("정적변수 : " + c.b);	// 1
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("일반변수 : " + c2.a);	// 1
		System.out.println("정적변수 : " + c2.b);	// 2
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("일반변수 : " + c3.a);	// 1
		System.out.println("정적변수 : " + c3.b);	// 3
		
		c3.b = 100;
		c2.b++;
		System.out.println(c.b);	//101
		
		// static 멤버는 클래스 바깥에서 생성된다.
		// 객체생성 없이 클래스명.변수명 으로 접근할 수 있다.
		Count.b = 0;
		System.out.println(Count.b);	// 0
	}

}
