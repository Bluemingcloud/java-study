package baekjoon.problem04;

import java.util.Scanner;

public class Problem10818 {
	public static void main(String[] args) {
//		N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		// 초기값을 첫번째 입력으로 두고 비교한다.
		int testNum = scan.nextInt();		
		int min = testNum;
		int max = testNum;
		
		int[] arr = new int[N];
		arr[0] = testNum;
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if(arr[i] >= max) {
				max = arr[i];
			}
			if(arr[i] <= min) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);		
		
		scan.close();
	}
}
