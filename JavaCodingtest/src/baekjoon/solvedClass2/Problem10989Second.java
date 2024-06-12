package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem10989Second {
	
	public static void main(String[] args) throws IOException {
		
		// 수 정렬하기 3
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] numArr = new int[n];
		while(n-- > 0) {
			int i = Integer.parseInt(br.readLine());
			numArr[numArr.length - n - 1] = i;
		}
		
		Arrays.sort(numArr);
		
		for(int num : numArr) {
			sb.append(num).append("\n");
		}
		System.out.println("" + sb);
		br.close();
	}

}
