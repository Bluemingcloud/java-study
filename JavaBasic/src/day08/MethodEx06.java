package day08;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx06 {
	
	public static void main(String[] args) {
		
		// Queue - First In First Out (FIFO)
		// 먼저 들어간 값이 먼저 나온다. (터널)
		// Stack 과 Queue 의 차이 알기.
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.close();
		for(int i = 1; i <= n; i++) {
			push(i);
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
				
		System.out.println(Arrays.toString(arr));
		
	}
	
	static int[] arr = {};
	
	static void push(int data) {
		
		// 배열 복사 메서드
		int[] temp = Arrays.copyOf(arr,arr.length + 1);
		
		temp[temp.length - 1] = data;
		arr = temp;
		temp = null;		
	}
	static int pop() {
		// 배열의 1번째 요소를 삭제, 삭제된 데이터 반환.
		if(arr.length > 0) {
			int data = arr[0];
//			int[] temp = new int[arr.length - 1];
//			for(int i = 0; i < temp.length; i++) {
//				temp[i] = arr[i + 1];
//			}
			// 범위 만큼의 배열 복사
			int[] temp = Arrays.copyOfRange(arr, 1, arr.length); // 복사할 배열, 시작위치, 끝 위치
			arr = temp;
			temp = null;
			return data;
		}
		return 0;
	
	}
	
}
