package quiz02;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
//		정수를 3개를 입력 받습니다.
//
//		입력 순서에 상관없이
//
//		큰값 중간값 작은값 의 형태로 출력해주세요.
//
//
//		(같은수의 입력은 없다고 가정합니다)
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int num1, num2, num3;
		
		if (a>b) {
			if (a>c) {
				num1 = a;
				if (b>c) {
					num2 = b;
					num3 = c;
				} else {
					num2 = c;
					num3 = b;
				}
			} else { //a<c
				num1 = c;
				num2 = a;
				num3 = b;
			}
		} else { //a<b
			if(a>c) {
				num1 = b;
				num2 = a;
				num3 = c;
			} else { //a<c
				num3 = a;
				if(b>c) {
					num1 = b;
					num2 = c;
				} else {
					num1 = c;
					num2 = b;
				}
			} 
		}
		System.out.println(num1 + " " + num2 + " " + num3);
		
		// switch 사용 - 가독성을 높인다.
		int check = 0;
		if(a>b && a>c) {
			check = 1;
		} else if(b>a && b>c) {
			check = 2;
		} else if(c>a && c>b) {
			check = 3;
		}
		
		switch(check) {
		case 1:
			num1 = a;
			if(b>c) {
				num2 = b;
				num3 = c;
			} else {
				num2 = c;
				num3 = b;
			}
			break;
		case 2:
			num1 = b;
			if(a>c) {
				num2 = a;
				num3 = c;
			} else {
				num2 = c;
				num3 = a;
			}
			break;
		case 3:
			num1 = c;
			if(a>b) {
				num2 = a;
				num3 = b;
			} else {
				num2 = b;
				num3 = a;
			}
			break;
		}
		System.out.println(num1 + " " + num2 + " " + num3);
		
		scan.close();
		
	}

}
