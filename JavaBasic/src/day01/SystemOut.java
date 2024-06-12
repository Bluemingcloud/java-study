package day01;

public class SystemOut {
	//main 입력 후 ctrl + space : public static void main(String[] args) { 가 바로 입력
	//일단, 모든 프로그램 코드는 main 안에서 적어줍니다.
	public static void main(String[] args) {
		//출력형식 3가지
		//print() - 개행이 없음
		System.out.print("개행이 없습니다. 주로 가로출력 할 때 사용합니다.\n");
		
		//println() - 자동으로 마지막에 개행추가, 출력이 필요할 때 이 명령문으로 주로 사용.
		System.out.println("마지막에 개행을 추가");
		
		//printf() - 출력형식을 지정하고, 값을 넣어주는 출력문
		/*
		 * 서식 문자
		 * %d - 정수를 받음
		 * %f - 실수를 받음
		 * %s - 문자열을 받음
		 * 
		 * C언어 형식
		 */
		System.out.printf("안녕하세요? \n");
		System.out.println("오늘은 5월 7일 입니다.");
		System.out.printf("오늘은 %d월 %d일 입니다.", 5, 7);
		System.out.printf("\n%s님의 생일은 %d월 %d일 입니다.","홍길동", 8, 17);
		System.out.printf("\n원주율은 %f입니다.", 3.14);
		//실수 서식문자는 출력 자리수를 조정 할 수 있습니다.
		//%f 사용시 정수를 입력하면 에러가 난다.
		System.out.printf("\n원주율은 %.3f입니다.", 3.14);
//		System.out.printf("\n원주율은 %f입니다.", 3);
		System.out.printf("\n원주율은 %d입니다.", 3);
		
		
		
		
	}

}
