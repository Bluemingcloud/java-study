package quiz06;

public class Quiz30 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. java()
		 * - 매개변수로 정수를 받습니다.
		 * - 매개변수 1 -> return "자";
		 * - 매개변수 2 -> return "자바";
		 * - 매개변수 3 -> return "자바자";
		 * - 매개변수 4 -> return "자바자바";
		 * 
		 * 2. sum()
		 * - 매개변수로 정수를 1개 받습니다.
		 * - 매개변수의 약수의 합계를 리턴
		 * - 매개변수 5 -> return 1 + 5
		 * - 매개변수 6 -> return 1 + 2 + 3 + 6
		 * 
		 * 3. primeNum()
		 * - 매개변수 2개를 받아서, 순서 상관없이, 두 수 사이의 합계를 리턴.
		 * - 1, 2 => return 1 + 2;
		 * - 2, 1 => return 1 + 2;
		 * - 1, 1 => return 0;		 * 
		 */
		
		System.out.println(java(5));			// 자바자바자
		System.out.println(sum(10));			// 1 + 2 + 5 + 10 = 18
		System.out.println(primeNum(5,3));		// 3 + 4 + 5 = 12
		System.out.println(primeNum(3,3));
	}
	
	static String java(int a) {
		String str = "";
		String java = "자바";
		for(int i = 0; i < a; i++) {
			str += java.charAt(i % 2);
		}
		return str;		
	}
	
	static String java2(int a) {
		String str = "";
		if(a % 2 == 0) {
			str += "바";
		} else {
			str += "자";
		}
		return str;
	}
	
	static int sum(int a) {
		int result = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				result += i;
			}
		}		
		return result;
	}
	
	static int primeNum(int a, int b) {
		return a == b ? 0 : (int)((Math.abs(a - b)) + 1) * (a + b) / 2;			
	}
	
	static int primeNum2(int a, int b) {
		
		if(a == b) return 0;	// 실행문이 하나면 중괄호 생략하고 작성 가능
		
		int max = a > b ? a : b;
		int min = a < b ? a : b;
		
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
	}
}
