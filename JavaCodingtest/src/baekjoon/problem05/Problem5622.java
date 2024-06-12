package baekjoon.problem05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5622 {
	
	public static void main(String[] args) {
		
		// 할머니의 다이얼 전화기
		/*
		전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 
		
		숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

		숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

		상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 
		
		예를 들어, UNUCIC는 868242와 같다.

		할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
		*/
		
		// [] : 1, [ABC] : 2, [DEF] : 3, [GHI] : 4, [JKL] : 5, 
		// [MNO] : 6, [PQRS] : 7, [TUV] : 8, [WXYZ] : 9
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// String[] arr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		// 65 66 67, 68 69 70, 71 72 73, 74 75 76, 77 78 79, 80 81 82 83, 84 85 86, 87 88 89 90
		// Map 을 이용하여 간단하게 표현 가능
		
		try {
			String str = br.readLine();
			int cnt = 0;
			for(int i = 0; i < str.length(); i++) {
				int num = 0;
				if(str.charAt(i) >= 'A' && str.charAt(i) < 'D') {
					num = 3;
				} else if(str.charAt(i) >= 'D' && str.charAt(i) < 'G') {
					num = 4;
				} else if(str.charAt(i) >= 'G' && str.charAt(i) < 'J') {
					num = 5;
				} else if(str.charAt(i) >= 'J' && str.charAt(i) < 'M') {
					num = 6;
				} else if(str.charAt(i) >= 'M' && str.charAt(i) < 'P') {
					num = 7;
				} else if(str.charAt(i) >= 'P' && str.charAt(i) < 'T') {
					num = 8;
				} else if(str.charAt(i) >= 'T' && str.charAt(i) < 'W') {
					num = 9;
				} else if(str.charAt(i) >= 'W' && str.charAt(i) <= 'Z') {
					num = 10;
				} else if(str.charAt(i) == ' ') {
					num = 2;
				} else {
					num = 11;
				}
				cnt += num;
			}
				
			bw.write(cnt + "");
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
