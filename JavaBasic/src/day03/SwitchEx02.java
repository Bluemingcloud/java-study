package day03;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수입력>");
		int point = scan.nextInt();
		
		switch ( point / 10 ) { // 값 안에 연산식을 넣을 수도 있음
		
		case 10:
		case 9:
			
			if(point >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
			System.out.println("축하합니다!");
			
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;

		default:
			System.out.println("재수강");
			break;
		}
	}
}
