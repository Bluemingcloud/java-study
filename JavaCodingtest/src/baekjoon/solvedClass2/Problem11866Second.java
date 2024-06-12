package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem11866Second {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		br.close();
		
		// 1 부터 n 까지의 배열 생성
		int[] arr = new int[n];
		for(int i = 1; i <= n; i++) {
			arr[i - 1] = i;
		}
		
		List<Integer> list = new ArrayList<>();
		
		int index = 0;
		// n 번 제거된다.
		while(n-- > 0) {
			
			int cnt = 1;
			while(cnt <= k) {
				// index 가 배열 길이가 될 때 0번으로 초기화
				if(index == arr.length) {
					index = 0;
				}
				// arr[index] 값이 0이 아닐때만 cnt++;
				if(arr[index] != 0) {
					cnt++;
				}
				index++;					
			}
			// 마지막에 index++ 했으므로 현재 제거될 인원은 index - 1 번째 이다.
			list.add(arr[index - 1]);
			// 제거된 인원은 0으로 바꾸기
			arr[index - 1] = 0;
		}
		
		StringBuilder sb = new StringBuilder("<");
		for(int i = 0; i < list.size() - 1; i++) {
			sb.append(list.get(i)).append(", ");
		}
		sb.append(list.get(list.size() - 1)).append(">");
		System.out.println(sb);	
		
	}

}
