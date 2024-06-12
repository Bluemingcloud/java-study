package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2751Third {
	
	public static void main(String[] args) throws IOException {
		
		// 수 정렬하기 2
		// 오름차순 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		// 정수 n 은 절대값이 1이상 1000000 이하
		// -1000000 부터 1000000 까지의 정수 총 20000001 개
		boolean[] arr = new boolean[2000001];
		
		for(int i = 0; i < n; i++) {
			arr[1000000 + Integer.parseInt(br.readLine())] = true;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]) {
				sb.append(i - 1000000).append("\n");
			}
		}
		System.out.println(sb);		
	}
}
