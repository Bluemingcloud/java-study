package day04;

import java.util.Scanner;

public class WhileEx04 {
	public static void main(String[] args) {
		
		// 여러번 입력받기
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();	// 반복의 횟수를 결정할 입력
		
		int i = 1;
		while(i<=num) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println("Case #" + i + ": " + (a+b));				
			
			i++;
		}
		
		scan.close();		
	}
}
