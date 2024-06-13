package baekjoon.solvedClass3;

import java.io.*;

public class Problem1463 {
	
	public static void main(String[] args) throws IOException {
		
		// 1로 만들기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		br.close();
		int cnt = 0;
		while(x > 1) {
			if(x % 3 == 0) {
				x /= 3;
			} else if(x % 2 == 0) {
				x /= 2;
			} else {
				x--;
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}
