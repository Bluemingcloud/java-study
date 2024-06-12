package quizObject16;

import java.util.Scanner;

public class TryQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 정수 2개를 입력받는다.
		 * 2. 입력받은 값이 정수라면, 단순히 정수의 합을 출력하고 반복문을 종료.
		 * 		무한 반복문이 돌면, 이유를 찾아서 해결해 보기
		 * 3. 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요"를 출력한 후 다시 입력받는다.
		 * 4. 반복문을 탈출하면 프로그램 정상종료 문장 띄우기
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.print("정수1>");
				int num1 = sc.nextInt();
				System.out.print("정수2>");
				int num2 = sc.nextInt();
				System.out.println("합:" + (num1 + num2));
				break;

			} catch (Exception e) {
				System.out.println("정수로만 입력하세요.");
				sc.nextLine();
			}
		}
		System.out.println("프로그램 정상 종료");
		sc.close();
		
	}

}
