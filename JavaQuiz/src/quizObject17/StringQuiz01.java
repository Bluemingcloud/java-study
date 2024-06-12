package quizObject17;

import java.util.Scanner;

public class StringQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 공백을 포함한 id를 입력받습니다.
		 * 2. 공백을 제거한 아이디가 5글자 미만이면, 다시 입력을 받으세요.
		 * 3. 아이디는 반드시 소문자여야 합니다.
		 * 4. 아이디가 5글자 이상이면 "아이디가 등록되었습니다." 를 출력하고 프로그램을 종료
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디를 입력하세요>");
			String id = sc.nextLine().replace(" ", "");
			if(id.length() >= 5) {
				id = id.toLowerCase();
				System.out.println("아이디가 등록되었습니다.");
				System.out.println("ID : " + id);
				break;
			} else {
				System.out.println("아이디는 5글자 이상이어야 합니다.");
			}			
		}
		sc.close();
		System.out.println("프로그램 종료");
		System.exit(0);
		
	}

}
