package day05;

import java.util.Scanner;

public class BreakEx02 {
	public static void main(String[] args) {
		/*
		 * 무한 반복문
		 *  - 	반복문의 횟수를 정확히 모를 때 주로 사용하고,
		 *  	while(true) 문장을 많이 사용합니다.
		 */
		// 특정 조건까지 무한입력.
		Scanner scan = new Scanner(System.in);
		
		String[] str = {"다시 입력하세요.", "틀렸습니다.", "정답이 아닙니다.", "오답 입니다."};
		while(true) {
			
			System.out.println("5 x 3 = ?");
			System.out.print(">");
			int num = scan.nextInt();
			
			//입력받은 값이 조건에 만족하면 탈출
			
			if(num == 5*3) {
				System.out.println("정답 입니다!");
				break;
			}
			System.out.println(str[(int)(Math.random()*str.length)]);	
		}	
		scan.close();
	}

}
