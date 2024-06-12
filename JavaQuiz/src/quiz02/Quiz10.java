package quiz02;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz10 {
	
	public static void main(String[] args) {
		
		//명인교육의 계산기
		/*
		명인교육은 사칙연산이 가능한 계산기를 만드려고 합니다.


		숫자, 연산자, 숫자 를 입력하여 사칙연산을 수행합니다.

		사용할 수 있는 연산자는 (+, -, *, /) 입니다
		4가지 연산자 외에 다른 연산자를 입력하면 "잘못입력" 을 출력합니다.

		5 + 4 = 9
		5 / 4 = 1

		숫자 문자 숫자 를 입력받아 연산결과를 출력하는 프로그램을 switch문으로 만들어주세요.
		*/
		/*
		 * 첫번째 세번째 에도 만약 잘못된 입력값으로 입력했을 때
		 * "잘못입력" 을 출력해보기
		 */
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		String cal = scan.next();
		int b = scan.nextInt();		
		
		switch(cal) {
		
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		default :
			System.out.println("잘못입력");
			break;
		}
				
		scan.close();
		// String 을 int 로 캐스팅 할 수 없음.
		// Integer.parseInt(String값) 으로 int 로 정수를 저장 가능.
		
//		String[] arr = new String[2];
//		arr[0] = scan.next();
//		String cal = scan.next();
//		arr[1] = scan.next();		
	}
}
