package baekjoon.solvedClass3;

import java.io.*;

public class Problem1463 {
	
	public static void main(String[] args) throws IOException {
		
		// 1로 만들기
		//    10
		//     9        5
		//     3  8     4
		//     1  4  7  2  3
		
		/*
		 *      1 -> 0
		 *      2 -> 1
		 *      3 -> 1
		 *      4 -> 2
		 *      5 -> 3
		 *      6 -> 2
		 *      7 -> 3
		 *      8 -> 3
		 *      9 -> 2
		 *      10 -> 3
		 *      11 -> 4
		 *      12 -> 3
		 *      13 -> 4
		 *      14 -> 4
		 *      15 -> 4
		 *      16 -> 4
		 *      17 -> 5
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		br.close();
		
		int[] arr = new int[x + 1];
		arr[1] = 0;
		for(int i = 2; i <= x; i++) {
			arr[i] = arr[i - 1] + 1;
			if(i % 3 == 0) {
				arr[i] = Math.min(arr[i], arr[i / 3] + 1);
			} 
			if(i % 2 == 0) {
				arr[i] = Math.min(arr[i], arr[i / 2] + 1);
			}
		}
		System.out.println(arr[x]);
		
	}

}
