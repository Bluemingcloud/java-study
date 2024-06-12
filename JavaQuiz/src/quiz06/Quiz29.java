package quiz06;

public class Quiz29 {
	
	public static void main(String[] args) {
		
		System.out.println("세 매개변수의 합 : " + method3(1, 2, 3.5));
		System.out.println("짝수 홀수 판별 : " + method4(10));
		System.out.println("매개 변수 int 만큼 String 반복 출력");
		method5("메소드5번",3);
		System.out.println("매개 변수 2개 중 더 큰 수 : " + maxNum(10,20));
		System.out.println("절대 값 : " + abs(-20));		
		
	}
	
	static double method3(int a, int b, double c) {
		return a + b + c;
	}
	/*
	static String method4(int a) {
		String str = "";
		if(a % 2 == 0) {
			str = "짝수";
		} else {
			str = "홀수";
		}
		return str;
	}
	*/
	static String method4(int a) {
		if(a % 2 == 0) {	// if else 둘 중 하나는 무조건 실행하므로 바로 return 사용가능
			return "짝수";	
		} else {
			return "홀수";
		}
	}
	
	static void method5(String str, int a) {
		for(int i = 0; i < a; i++) {
			System.out.println(str);
		}
		return;
	}
	
	/*
	static int maxNum(int a, int b) {
		int max = 0;
		if(a >= b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}
	*/
	static int maxNum(int a, int b) {
		return a > b ? a : b;
	}
	
	/*
	static int abs(int a) {
		int result;
		if(a > 0) {
			result = a;
		} else {
			result = - a;
		}
		return result;
	}
	*/
	static int abs(int a) {
		return a < 0 ? -a : a;
	}
}
