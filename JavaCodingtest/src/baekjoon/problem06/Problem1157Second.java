package baekjoon.problem06;

import java.io.*;
import java.util.*;

public class Problem1157Second {
	public static void main(String[] args) throws IOException {
		// 입력 받은 단어의 중복이 제일 많은 알파벳을 출력 
		// 최대 중복 수 가 같으면 ? 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().replace("", " "));
		br.close();
		int[] cnt = new int['Z' - 'A' + 1];
		int maxCnt = 0;
		while(st.hasMoreTokens()) {
			int idx = st.nextToken().toUpperCase().charAt(0) - 'A';
			cnt[idx]++;
			if(cnt[idx] > maxCnt) maxCnt = cnt[idx];
		}
		
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for(int i = 0; i < cnt.length; i++) {
			if(cnt[i] != maxCnt) continue;
			sb.append((char)(i + 'A'));
			
			if(flag) {
				sb = new StringBuilder("?");
				break;
			}
			flag = true;
		}
		System.out.println(sb.toString());
	}
}
