package day07;

public class ObjectBasic01 {
	
	public static void main(String[] args) {
		
		// 기존에 사용하던 방법
		System.out.println("------1번 계산기------");
		System.out.println(add(1));
		System.out.println(add(2));
		System.out.println(add(3));
		System.out.println("------2번 계산기------");
		System.out.println(add2(10));
		System.out.println(add2(20));

		
	}
	
	static int result = 0;	
	static int add(int a) {
		result += a;
		return result;
	}
	static int result2 = 0;	
	static int add2(int a) {
		result2 += a;
		return result2;
	}

}
