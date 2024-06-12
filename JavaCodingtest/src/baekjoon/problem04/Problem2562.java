package baekjoon.problem04;

import java.util.Scanner;

public class Problem2562 {
	public static void main(String[] args) {
//		9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//
//		예를 들어, 서로 다른 9개의 자연수
//
//		3, 29, 38, 12, 57, 74, 40, 85, 61
//
//		이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
		
//		배열을 사용하여 풀어보기
		
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		int cnt = 0;
		
		int i = 0;
		while(i < 9) {
			int num = scan.nextInt();
			if(num > max) {
				max = num;
				cnt = i+1;
			}
			i++;
		}
		System.out.println(max);
		System.out.println(cnt);
		
		scan.close();		
	}
}
