package baekjoon.problem03;

import java.util.Scanner;

public class Problem25314 {
	public static void main(String[] args) {
		//코딩은 체육과목 입니다.
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i = 0; i < N / 4; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
		
		scan.close();		
	}
}
