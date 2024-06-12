package day05;

import java.util.Scanner;

public class MultiForEx02 {
	public static void main(String[] args) {
		
		// 사각형 출력.
		/*
		 *  가로 5, 세로 4
		 *  *****
		 *  *****
		 *  *****
		 *  *****
		 *  가 출력되게 만들기. 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();			// 가로
		int b = scan.nextInt();			// 세로
		scan.close();
		
		for(int i = 0; i < b; i++) {		// 세로 b 번 출력
			String str = "";
			for(int j = 0; j < a; j++) {	// 가로 a 번 ★ 더하기
				str += "★";
			}
			System.out.println(str);	
		}
		
		System.out.println("-----------------");
		
		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
		
		
	}

}
