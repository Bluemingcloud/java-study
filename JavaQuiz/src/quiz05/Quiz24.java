package quiz05;

import java.util.Scanner;

public class Quiz24 {
	public static void main(String[] args) {
		/*
		 * updown 게임
		 * 
		 * 1~100 까지의 랜덤 숫자 (정답 값)
		 * 
		 * 스캐너를 통해 값을 입력 받고,
		 * 랜덤수가 입력받은 값보다 작으면 "더 작은수를 입력하세요."
		 * 크면 "더 큰수를 입력하세요."
		 * 
		 * 정답을 맞추면 시도횟수를 출력하고 종료.
		 */
		Scanner scan = new Scanner(System.in);
		
		int ranNum = (int)(Math.random() * 100 + 1);
		int cnt = 0;
		
		boolean run = true;	
		
		while(run) {
			System.out.print("정답입력>");
			int num = scan.nextInt();
			
			if(num == ranNum) {
				cnt++;
				System.out.println("정답입니다.");
				System.out.println("시도횟수:" + cnt);				
				run = false;
			} else if(num < ranNum) {
				cnt++;
				System.out.println("더 큰수를 입력하세요");				
			} else {
				cnt++;
				System.out.println("더 작은수를 입력하세요");				
			}			
		}
		scan.close();
	}

}
