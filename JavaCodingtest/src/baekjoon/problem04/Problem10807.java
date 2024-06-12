package baekjoon.problem04;

import java.util.Scanner;

public class Problem10807 {
	public static void main(String[] args) {
//		총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] nArr = new int[N];
		
		for(int i = 0; i<nArr.length; i++) {
			nArr[i] = scan.nextInt();
		}
		
		int v = scan.nextInt();
		int cnt = 0;
		
		for(int check : nArr) {
			if(check == v) {
				cnt++;
			}
		}
		
		System.out.println(cnt);		
		
		scan.close();		
	}
}
