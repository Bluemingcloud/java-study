package baekjoon.solvedClass2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem11866 {
	
	public static void main(String[] args) {
		
		// 요세푸스 문제 0
		/*
		 * 요세푸스 문제는 다음과 같다.
		 * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 
		 * 이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
		 * 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 
		 * 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
		 * 
		 * N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
		 * 
		 * 1 2 3 4 5 6 7
		 * 
		 * 1 2 0 4 5 6 7
		 * 
		 * 1 2 0 4 5 0 7
		 * 
		 * 1 0 0 4 5 0 7
		 * 
		 * 1 0 0 4 5 0 0
		 * 
		 * 1 0 0 4 0 0 0
		 * 
		 * 0 0 0 4 0 0 0
		 * 
		 * 0 0 0 0 0 0 0
		 */ 
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		
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
