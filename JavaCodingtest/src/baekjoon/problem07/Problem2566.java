package baekjoon.problem07;

import java.util.Scanner;

public class Problem2566 {
	
	public static void main(String[] args) {
		/*
		<그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 
		
		이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.

		예를 들어, 다음과 같이 81개의 수가 주어지면
		
		이들 중 최댓값은 90이고, 이 값은 5행 7열에 위치한다.
		*/
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		scan.close();
		
		int max = 0;
		int a = 1;
		int b = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					a = i + 1;
					b = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(a + " " + b);
	}
}
