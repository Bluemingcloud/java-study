package baekjoon.problem03;

import java.util.Scanner;

public class Problem3052 {
	public static void main(String[] args) {
		// 42로 나눈 나머지가 다른 값의 개수
		Scanner scan = new Scanner(System.in);
		
		// 42로 나누면 나머지는 0 부터 41 까지 존재할 수 있다.
		int[] arr = new int[42];
		for(int i = 0; i<10; i++) {
			arr[scan.nextInt()%42]++;			
		}
		int cnt = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		scan.close();
	}
}
