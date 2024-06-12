package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2751 {
	
	public static void main(String[] args) throws IOException {
		
		// 수 정렬하기 2
		// 오름차순 정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		for(int a : arr) {
			sb.append(a).append("\n");
		}
		System.out.println("" + sb);			
		
	}

}
