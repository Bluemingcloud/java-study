package day10.static_.method;

import java.util.Arrays;

public class MainClass {
	// main 은 static 
	// 항상 main 에서 객체를 생성하여 클래스 멤버에 접근하였다.
	public static void main(String[] args) {
		
		Count c = new Count();
		c.method01();
		//c.method02();
		
		//static 메서드의 사용 - 클래스명.메서드명()
		Count.method02();
		
		//test(); // 메서드 test 는 static 멤버가 아니므로 바로 사용 불가.
		
		// MainClass 객체를 생성하여 사용.
		MainClass m = new MainClass();
		m.test();
		
		// 주로 사용하던 static 메서드
		// 객체 생성 없이 사용
		double d = Math.random();
		Arrays.toString(new int[3]);
		String.valueOf(false);
		Integer.parseInt("3");
	}
	
	public void test() {
	}

}
