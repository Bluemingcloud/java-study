package quizObject16;

import java.util.Scanner;

public class TryQuiz02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ranNum = (int)(Math.random() * 100) + 1;
		
		int cnt = 1;
		while(true) {			
			try {
				System.out.print("1과 100 사이의 값을 입력하세요>");
				int n = sc.nextInt();
				if(n == ranNum) {
					System.out.println("정답입니다");
					System.out.println("시도 횟수는 : " + cnt);
					break;
				}
				if(n > ranNum) {
					System.out.println("더 작은 수를 입력하세요");
				} else {
					System.out.println("더 큰 수를 입력하세요");
				}				
				
			} catch (Exception e) {
				System.out.println("잘못 입력했습니다.");
				sc.nextLine();
			} finally {
				cnt++;
			}			
		}
		sc.close();		
	}
}
