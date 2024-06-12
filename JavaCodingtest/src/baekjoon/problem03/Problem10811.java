package baekjoon.problem03;

import java.util.Scanner;

public class Problem10811 {
	public static void main(String[] args) {
		// 바구니 뒤집기
		//5 4	1 2 3 4 5
		//1 2	2 1 3 4 5
		//3 4	2 1 4 3 5
		//1 4	3 4 1 2 5
		//2 2	3 4 1 2 5
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		// 1 부터 N 까지의 정수가 차례대로 들어가 있는 정수 배열 생성
		int[] basketArr = new int[N];
		for(int i = 0; i < basketArr.length; i++) {	// N -> 5 : 1 2 3 4 5 6 7 8 9 10
			basketArr[i] = i+1;
		}
		
		// M 번 두 정수를 입력 받고 요구조건 실행
		for(int i = 0; i < M; i++) {									// first 첫번째 정수, last 마지막 정수
			int first = scan.nextInt();
			int last = scan.nextInt();
			
			// 범위 만큼의 임시 배열 생성
			int[] tempArr = new int[last - first + 1];
			
			// first 부터 last 까지를 뒤집기. 배열은 first-1 부터 last-1 까지 인덱스의 내용을 뒤집기
			for (int j = 0; j<=(last - first + 1)/2; j++) {				// (last - first) + 1 을 2로 나눈 몫 만큼 서로의 위치를 바꾸면 된다.	
				tempArr[j] = basketArr[last-1-j];		
				tempArr[tempArr.length-1-j] = basketArr[first-1+j];		// 인덱스의 시작은 0 부터. -1 의 필요 인지하기.
			}
			
			// 원래의 배열에 바뀐배열 값 넣기.
			for (int j = 0; j<tempArr.length; j++ ) {
				basketArr[first+j-1] = tempArr[j];
			}
		}
		
		String result = "";
		for (int i = 0; i<basketArr.length; i++) {
			result += basketArr[i] + " ";
		}
		System.out.println(result);
				
		scan.close();		
	}
}
