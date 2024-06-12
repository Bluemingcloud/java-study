package day07;

public class MethodEx02 {
	
	public static void main(String[] args) {
		
		/*
		 * 매개변수(Parameter)
		 * 1. 매개변수는 메서드 호출시 전달하는 매개체 입니다.
		 * 2. 매개변수를 받지 않으면 () 비워두면 되고, 여러개 받고 싶다면 ,로 연결합니다.
		 */
		System.out.println("1~10 까지 합 : " + isCalSum(10));
		System.out.println("1~100 까지 합 : " + isCalSum(100));
		
		String str = isRepeatStr(1,4,"안녕");
		System.out.println(str);
		
	}
	
	
	// 어떤 값을 매개변수로 받아서 매개변수 까지의 합계
	static int isCalSum(int end) {
		int sum = 0;
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 시작값, 끝값, 문자열을 전달 받아서, 문자열을 반복하여 반환하는 메서드
	static String isRepeatStr(int start, int end, String str) {
		String s = "";
		for(int i = start; i <= end; i++) {
			s += str;
		}
		return s;
	}

}
