package quiz02;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
//		숫자 2개를 입력 받아, 큰 숫자를 출력하는 프로그램 코드를 작성하세요.
//
//		같은 수라면 0을 출력하면 됩니다
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();		
		int b = scan.nextInt();
		int max;
		
		if(a==b) {		// 같은 경우
			max = 0;
		} else {
			if (a>b) {	// a 가 큰 경우
				max = a;
			} else {	// b 가 큰 경우
				max = b;
			}
		}
		System.out.println(max);
				
		scan.close();
	}
}
