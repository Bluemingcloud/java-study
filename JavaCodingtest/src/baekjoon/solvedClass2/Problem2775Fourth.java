package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2775Fourth {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		int[][] arr = new int[15][15];
		
		int t = Integer.parseInt(br.readLine());		
			
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			for(int j = 0; j < arr[0].length; j++) {
				arr[0][j] = j;
			}
			
			for(int f = 1; f <= k; f++) {
				for(int r = 1; r <= n; r++) {
					arr[f][r] = arr[f][r - 1] + arr[f - 1][r];
				}
			}
			sb.append(arr[k][n]);
			sb.append("\n");
		}
		bw.write(""+sb);
		bw.flush();
		bw.close();
		br.close();		
	}
}
