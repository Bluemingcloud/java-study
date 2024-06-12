package day03;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		
		// if ~ else if ~ else 구문 예제
		// else if 사용시 조건문 순서에 주의
		// 점수를 입력받아서 점수에 따른 학점을 부여
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수입력>");
		int point = scan.nextInt();
		
		if(point >= 90) {
			//System.out.println("A학점");
			//90점 이상일때 또 다른 조건을 검사하고 싶음 -> 중첩 if
			if(point >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
			//90점 이상일때 항상 실행되는 부분
			System.out.println("축하합니다!");
			
		} else if(point >= 80) {
			if(point >= 85) {
				System.out.println("B+학점");
			} else {
				System.out.println("B학점");
			}
		} else if(point >= 70) {
			if(point >= 75) {
				System.out.println("C+학점");
			} else {
				System.out.println("C학점");				
			}
		} else if(point >= 60) {
			if(point >= 65) {
				System.out.println("D+학점");
			} else {
				System.out.println("D학점");				
			}
		} else {
			System.out.println("F학점");
		}
		
		scan.close();		
	}
}
