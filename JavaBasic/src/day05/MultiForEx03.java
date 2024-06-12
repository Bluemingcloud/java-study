package day05;

import java.util.Scanner;

public class MultiForEx03 {
	public static void main(String[] args) {
		
		// 바깥에 반복 횟수에 따라서 다르게 회전하는 반복문
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}		
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 출력
		 */
		Scanner scan = new Scanner(System.in);
		int star = scan.nextInt();
		
		scan.close();
		for(int i = 0; i < star; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
		System.out.println("--------------------");
		
		//감소되는 모양
		for(int i = 0; i < star; i++) {
			for(int j = star; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= star + 1 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		//별을 찍기전 공백도 출력.
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < star - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		
		//피라미드
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < star - i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
