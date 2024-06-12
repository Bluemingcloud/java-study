package day08;

public class MethodEx07 {
	
	public static void main(String[] args) {
		
		// 메서드 안에서 메서드 호출
		method01();	// 동기적인 호출 (순서대로)
		
		// 재귀적인 호출 - 메서드 안에서 자신을 호출시킴(성능이 안좋음)
		
		recursive(1);
		System.out.println(factorial(5));
	}
	
	static void method01() {
		System.out.println("method01 start");
		method02();
		System.out.println("method01 end");
	}
	
	static void method02() {
		System.out.println("method02 start");
		
		System.out.println("method02 end");		
	}
	
	static void recursive(int a) {
		
		// 재귀를 탈출할 조건이 반드시 필요
		if(a == 10) return;
		
		System.out.println(a + "호출");
		a++;		
		
		recursive(a);
	}
	
	static int factorial(int a) {
		if(a == 1) return 1; 
		return a * factorial(a - 1);
	}

}
