package day02;

public class OperatorEx04 {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 5;
		
		a += 3;	// a = a + 3; -> 9
		
		//a =+ 3; // a = 3; 양수 3을 대입한다 라는 실행문
		
		System.out.println(a);
		
		a -= 4;	// a = a - 4; -> 5
		a *= 10;// a = a * 10;-> 50
		a /= 5;	// a = a / 5; -> 10
		a %= 2; // a = a % 2; -> 0
		
		System.out.println(a);
	}
}
