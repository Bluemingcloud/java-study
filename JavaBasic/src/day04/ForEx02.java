package day04;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		/*
		 * 
		 * 소수 판별하기
		 * 소수 - 약수가 1과 자기자신인 수
		 * 2, 3, 5, 7 ...
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력>");
		int num = scan.nextInt();
		scan.close();
		int cnt = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		if(cnt == 1) {
			System.out.println(num + "은(는) 소수 입니다.");
		} else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}
		
	}

}
