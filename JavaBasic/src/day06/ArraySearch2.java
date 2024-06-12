package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch2 {
	
	public static void main(String[] args) {
		
		// 업 다운 게임 <- 보통 중간 값을 넣어본다.
		// 이진 탐색 - 반반 분할해서 값을 찾아가는 방법
		// 조건 - 배열이 정렬되어 있어야 한다.
		
		/*
		 * 1. 시작값 = 0, 끝값 = 배열의 마지막값 을 처음에 2개 배치
		 * 2. 중간값을 구함
		 * 3. 중간값이 찾는 값인지 확인
		 * 4. 중간값이 찾는값보다 크면, end를 중간값 -1 내림
		 * 5. 중간값이 찾는값보다 작으면, start를 중간값 + 1 올림
		 * 반복
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int find = scan.nextInt();
		scan.close();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 99) + 1;
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(arr[mid] == find) {
				System.out.println("찾는 값: 인덱스 " + mid + " 에 있는 " + arr[mid] + " 입니다.");
				break;
			} else if(arr[mid] < find) {
				start = mid + 1;
			} else if(arr[mid] > find) {
				end = mid - 1;
			}			
		}
		if(start > end) {
			System.out.println(find + " 은(는) 없습니다.");
		}
		
		// 이진탐색기능
		
		System.out.println(Arrays.binarySearch(arr, 79)); // 배열이름, 찾을값 
		// 음수가 나오면 값이 없다는 뜻
		// 양수가 나오면 해당 위치가 나옴
	}
}
