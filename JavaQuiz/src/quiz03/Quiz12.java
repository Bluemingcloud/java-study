package quiz03;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {

		/*
		 * 어떤수 N을 입력받아서 N까지의 구구단 모형의 출력을 완성
		 */
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요>");
//		int num = scan.nextInt();
//		int i = 1;
//		
//		System.out.println("구구단: " + num + "단");
//		
//		while(i <= 9) {
//			System.out.println(num + " x " + i + " = " + num * i);
//			i++;
//		}
//		
//		scan.close();
//		
//		System.out.println("--------------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>");
		int dan = scan.nextInt();
		
		System.out.println("구구단: " + dan + "단");
		int i = 1;
		while(i <= 9) {
			System.out.println(dan + " x " + i + " = " + dan * i);
			i++;
		}
	}
}
