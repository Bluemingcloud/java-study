package baekjoon.solvedClass2;

import java.util.Scanner;

public class Problem1546 {
	public static void main(String[] args) {
		
		// 평균 조작하기
		// N 개의 과목. 
		// N 번의 점수 입력
		// 최대 점수 M 원래점수는 원래점수/M*100 한 값이 된다.
		// 조작 후 과목의 평균 구하기.
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double[] arr = new double[N];
		
		double M = Integer.MIN_VALUE;		
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextDouble();
			if(arr[i] >= M) {
				M = arr[i];
			}
		}
		
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != M) {
				sum += arr[i];
			} else {
				sum += M;
			}
		}
		
		System.out.println(((sum)/M*100)/N);
		
		scan.close();		
	}
}