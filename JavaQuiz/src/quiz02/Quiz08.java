package quiz02;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		
//		어떤 정수를 입력받아
//
//		홀수라면 홀수
//		짝수라면 짝수
//		0이라면 제로
//		음수라면 음수
//
//		를 출력하는 프로그램 코드를 작성해주세요
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		// if 문 반복 사용
		String checkNum = new String();
		if(num == 0) {
			checkNum = "제로";
		}
		if(num < 0) {
			checkNum = "음수";
		}
		if(num > 0 && num % 2 == 0) {
			checkNum = "짝수";
		}
		if(num > 0 && num % 2 != 0) {
			checkNum = "홀수";
		}
		System.out.println(checkNum);
		/*
		 * 장점
		 * - 각 조건에 대한 분기가 명확하게 나뉘어집니다. 
		 * - 복잡한 조건을 검사할 때 유용합니다.   
		 *
		 * 단점
		 * - 여러 개의 조건을 연달아 작성할 경우 가독성이 떨어질 수 있습니다.
		 */
		
		// else if 문 사용
		if(num == 0) {
			System.out.println("제로");
		} else if(num < 0) {
			System.out.println("음수");
		} else if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		/*
		 * 장점
		 * - 각 조건이 순차적으로 평가되므로, 첫 번째로 만족하는 조건만 실행되고 나머지는 건너뜁니다.
		 * - 여러 개의 상호배타적인 조건을 다룰 때 유용합니다.
		 * 단점
		 * - 조건이 많을 경우 중첩되는 형태가 되어 가독성이 떨어질 수 있습니다.
		 */
		
		// 중첩 if 문 사용
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else {
			if(num < 0) {
				System.out.println("음수");
			} else {
				System.out.println("제로");
			}
		}
		/*
		 * 장점
		 * - 복잡한 조건을 다룰 때 특히 유용합니다.
		 * - 각 조건에 대한 명확한 분기가 가능합니다.
		 * 단점
		 * - 여러 단계의 중첩이 생길 경우 코드의 가독성이 저하될 수 있습니다.  
		 */
		
		// 3항 연산자 사용
		if(num <= 0) {
			System.out.println( num == 0 ? "제로" : "음수" );
		} else {
			System.out.println( num % 2 == 0 ? "짝수" : "홀수" );
		}
		
		// 3항 연산자 만 사용
		String check = num <= 0 ? ( num == 0 ? "제로" : "음수" ) : ( num % 2 == 0 ? "짝수" : "홀수" );
		System.out.println(check);
		/*
		 * 장점
		 *  - 코드가 간결하고 읽기 쉽습니다.
		 *  - 간단한 조건에 대해 사용하기 용이합니다.
		 *  
		 * 단점
		 *  - 복잡한 조건을 다루기 어렵습니다. 
		 *  - 가독성이 떨어질 수 있습니다.
		 */
		
		// 메소드 사용
		System.out.println(isCheck(num));
		/*
		 * 장점
		 * 	- 코드의 재사용성을 높여줍니다.
		 * 	- 각 조건에 대한 분기가 메소드 내부에 숨겨져 가독성을 높일 수 있습니다.
		 * 
		 * 단점
		 *  - 메소드 호출에 따른 오버헤드가 발생할 수 있습니다.
		 *  - 단순한 조건 검사에는 메소드를 만들기에 비효율적일 수 있습니다.
		 */
				
		scan.close();		
	}
	public static String isCheck(int number) {
		String result = number <= 0 ? ( number == 0 ? "제로" : "음수" ) : ( number % 2 == 0 ? "짝수" : "홀수" );
		return result;
	}
}
