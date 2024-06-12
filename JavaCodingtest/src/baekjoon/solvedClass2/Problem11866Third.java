package baekjoon.solvedClass2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Problem11866Third {
	
	public static void main(String[] args) throws IOException {
		
		// 요세푸스 문제 0
		// <3, 6, 2, 7, 5, 1, 4>
		// [1, 2, 3, 4, 5, 6, 7] 
		// 1 -> idx = (0 + 3 - 1) % 7 = 2   list.remove(idx) = 3
		// [1, 2, 4, 5, 6, 7] 
		// 2 -> idx = (2 + 3 - 1) % 6 = 4   list.remove(idx) = 6
		// [1, 2, 4, 5, 7]
		// 3 -> idx = (4 + 3 - 1) % 5 = 1   list.remove(idx) = 2
		// [1, 4, 5, 7]
		// 4 -> idx = (1 + 3 - 1) % 4 = 3	list.remove(idx) = 7
		//
		// 인덱스는 그전 인덱스 부터 시작
		//  0 1 2 3 4 5 6
		// [1 2 3 4 5 6 7]     에서 3번째 는 
		//                     1부터 시작 오른쪽 두칸 이동 -> index 2 의 값 3
		//
		//  0 1   2 3 4 5      
		// [1 2   4 5 6 7]     에서 6번째 는 
		//                     4부터 시작 오른쪽 두칸 이동 -> index 4 의 값 6
		//
		//  0 1   2 3   4
		// [1 2   4 5   7]     에서 9번째 는
		//                     7부터 시작 오른쪽 두칸 이동
		//                     원을 그리고 앉아 있으므로 7 바로 옆칸은 1부터 시작
		//                                                 -> index 1 의 값 2
		// 
		// k - 1 칸 오른쪽으로 이동 -> k - 1 증가
		// 전체 크기를 넘어가면 0 부터 시작 -> 항상 (% 전체 크기) 한 값
		// ex) 총 size 7 인 list의 13 번째 인덱스
		//     
		//     0 1 2 3 4 5 6 
		//    [1 2 3 4 5 6 7]
		// 
		//     7 8 9 10 11 12 13
		//    [1 2 3 4  5  6  7]
		//    
		//    7 로 나눈 나머지 가 같은 인덱스 끼리 같은 값을 가진다.
		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		br.close();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < n; i++) {
			list.add(i + 1);
		}
		
		StringBuilder sb = new StringBuilder("<");
		int idx = 0;
		while(n > 1) {
			idx = (idx + k - 1) % n;
			sb.append(list.remove(idx)).append(", ");	
			n--;
		}
		sb.append(list.remove()).append(">");
		System.out.println(sb);
		
		
	}

}
