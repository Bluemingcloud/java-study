package quiz04;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		/*
		정수 2개를 입력 받습니다.

		이 정수 사이의 합을 구해주세요.

		예를들어
		1 5가 입력되면 1 + 2 + 3 + 4 + 5 = 15 입니다
		5 1가 입력되면 1 + 2 + 3 + 4 + 5 = 15 입니다

		만약 같은 수라면 0이 출력 됩니다.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int a = 0;
		int b = 0;
		
		if (n==m) {
			a = 0;
			b = 0;
		} else if (n > m) {
			a = m;
			b = n;
		} else {
			a = n;
			b = m;
		}
		
		int sum = 0;
		for(int i = a; i<=b; i++) {
			sum += i;
		}		
		
		System.out.println(sum);
		
//		int sum2 = (a+b)*(b-a+1)/2;
//		System.out.println(sum2);
				
		scan.close();
				
	}

}
