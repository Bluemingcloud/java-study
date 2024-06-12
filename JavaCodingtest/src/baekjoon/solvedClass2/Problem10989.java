package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10989 {
	
	public static void main(String[] args) throws IOException {
		
		// 수 정렬하기 3
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[10001];
		
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != 0) {
				for(int j = 0; j < arr[i]; j++) {
					sb.append(i).append("\n");
				}
			}			
		}
		System.out.println("" + sb);
		br.close();
	}

}
