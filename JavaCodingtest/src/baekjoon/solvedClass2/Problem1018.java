package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1018 {
	
	public static void main(String[] args) throws IOException {
		
		// 체스판 다시 칠하기
		
		/*
		 * 지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다. 
		 * 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 
		 * 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.
		 * 
		 * 체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 
		 * 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 
		 * 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 
		 * 
		 * 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 
		 * 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.
		 * 
		 * 보드가 체스판처럼 칠해져 있다는 보장이 없어서, 
		 * 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 
		 * 당연히 8*8 크기는 아무데서나 골라도 된다. 
		 * 
		 * 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		char[][] arr = new char[n][m];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		int min = 64;
		for(int i = 0; i <= arr.length - 8; i++) {
			for(int j = 0; j <= arr[i].length - 8; j++) {
				int cnt1 = 0;
				int cnt2 = 0;
				for(int k = 0; k < 8; k++) {
					for(int l = 0; l < 8; l++) {
						if((i + k + j + l) % 2 == 0) {
							if(arr[i + k][j + l] == 'W') {
								cnt1++;
							} else {
								cnt2++;
							}
						} else {
							if(arr[i + k][j + l] == 'W') {
								cnt2++;
							} else {
								cnt1++;
							}
						}
					}
				}
				
				if(64 - cnt1 < min | 64 - cnt2 < min) {
					if(64 - cnt1 >= 64 - cnt2) {
						min = 64 - cnt2;
					} else {
						min = 64 - cnt1;
					}
				}
			}			
		}
		System.out.println(min);
		br.close();
	}
}
