package day10.static_.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		// static 블록 사용
		System.out.println(Calculator.pi);
		
		// 호출될 때 딱 1번만 실행된다.
		System.out.println(Calculator.pi);
		System.out.println(Calculator.pi);
		System.out.println(Calculator.pi);
		
		double circle = Calculator.circle(3);
		System.out.println(circle);
	}

}
