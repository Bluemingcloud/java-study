package quiz04;

import java.util.Scanner;

public class Quiz21 {
	public static void main(String[] args) {
		
		/*
		 * 가로, 세로를 입력받아서 사각형을 출력합니다.
		 * 단, 윤곽만 출력합니다.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로>");
		int a = scan.nextInt();	// 가로
		System.out.print("세로>");
		int b = scan.nextInt();	// 세로
		scan.close();
		
		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				if(i == 0 | i == b-1) {
					System.out.print("*");
				} else {
					System.out.print(j == 0 | j == a - 1 ? "*" : " ");
				}
			}
			System.out.println();
		}
	}
}
