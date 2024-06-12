package quizObject16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. main 에서 스캐너를 사용해서 2개의 정수값을 입력받음
		 * 2. divide(정수 2개)를 입력받는 메서드에 전달해 주세요
		 * 
		 *  3. divide() 메서드 에서 b가 0 인경우 예외를 강제생성해서 종료하는 구문을 작성해 주세요.
		 *  4. main에서 입력받을  때는, 문자인경우 예외처리를 진행하고, 다시 입력받으세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while(true) {
			try {
				a = sc.nextInt();
				b = sc.nextInt();
				
				System.out.println(divide(a, b));
				break;
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				sc.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 정상 종료");
		sc.close();
	}
	public static int divide(int a, int b) throws ArithmeticException {
		if(b == 0) {
			throw new ArithmeticException("b 값으로 0을 받음.");
		}
		return a / b;
	}

}
