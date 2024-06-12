package quiz03;

import java.util.Scanner;

public class Quiz12_2 {
	public static void main(String[] args) {

		/*
		 * 어떤수 N을 입력받아서 N까지의 구구단 모형의 출력을 완성
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>");
		int N = scan.nextInt();
		int i = 1;
		
		System.out.println("구구단 : " + N + " 단의 구구단");
		while(i<=9) {
			System.out.println(N + " x " + i + " = " + N*i);
			i++;
		}				

		scan.close();
	}

}
