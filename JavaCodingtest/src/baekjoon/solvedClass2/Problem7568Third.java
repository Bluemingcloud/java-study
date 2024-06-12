package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem7568Third {
	
	public static void main(String[] args) throws IOException {
		
		// 덩치
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			 st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(rank(arr, i)).append(" ");
		}
		
		bw.write("" + sb);
		bw.flush();
		bw.close();
	}
	public static int rank(int[][] arr, int i) {
		int temp = 1;
		for(int j = 0; j < arr.length; j++) {
			if(i == j) {
				continue;
			}
			if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
				temp++;
			}					
		}
		return temp;
	}
}
