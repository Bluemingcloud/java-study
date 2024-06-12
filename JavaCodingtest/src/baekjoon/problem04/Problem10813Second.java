package baekjoon.problem04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10813Second {
	public static void main(String[] args) {
		
		// 공 넣기
		/*
		 *  5 4		1 2 3 4 5	
			1 2		2 1 3 4 5		
			3 4		2 1 4 3 5
			1 4		3 1 4 2 5
			2 2		3 1 4 2 5
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			String[] strArr = br.readLine().split(" ");
			
			int n = Integer.parseInt(strArr[0]);
			int m = Integer.parseInt(strArr[1]);
			
			int[] numArr = new int[n];
			for(int i = 0; i < numArr.length; i++) {
				numArr[i] = i+1;
			}
			
			for(int i = 0; i < m; i++) {
				String[] strArr2 = br.readLine().split(" ");
				int temp = numArr[Integer.parseInt(strArr2[0]) - 1];
				numArr[Integer.parseInt(strArr2[0]) - 1] = numArr[Integer.parseInt(strArr2[1]) - 1];
				numArr[Integer.parseInt(strArr2[1]) - 1] = temp;
			}
			for(int num : numArr) {
				bw.write(num + " ");
			}
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
