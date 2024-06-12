package quiz04;

import java.util.Scanner;

public class Quiz23 {
	public static void main(String[] args) {
		
		/*
		 * 프로그램이 실행되면, 랜덤한 덧셈 문제를 출력해줍니다.
		 * 이 랜덤한 수의 범위는 1~100 사이의 값 입니다. 
		 * 
		 * 사용자가 답안을 입력할 때마다, 정답 또는 오답 카운트가 누적됩니다.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		boolean run = true;
		
		while(run) {
			
			int ranNum1 = (int)(Math.random() * 100) + 1;
			int ranNum2 = (int)(Math.random() * 100) + 1;
			
			System.out.println(ranNum1 + " + " + ranNum2 + " = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			
			int ans = scan.nextInt();
			
			if(ans == 0) {
				System.out.println("프로그램 정상 종료");
				System.out.println("정답 : " + cnt1);
				System.out.println("오답 : " + cnt2);
				run = false;
			}
			
			if(ans == ranNum1 + ranNum2) {
				System.out.println("정답입니다.");
				cnt1++;
			} else {
				System.out.println("오답입니다.");
				cnt2++;	
			}	
			
			System.out.println("---------------");
			
		}
		
		scan.close();
		
	}
}
