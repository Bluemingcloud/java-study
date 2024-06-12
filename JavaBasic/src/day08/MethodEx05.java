package day08;

import java.util.Arrays;

public class MethodEx05 {
	
	public static void main(String[] args) {
		
		// 배열의 한계점 - 크기가 정적이다.
		// Stack - Last In First Out (LIFO)
		// 마지막에 추가된 값이 제일 먼저 빠져 나온다.
		
		push(4);
		System.out.println(Arrays.toString(arr));
		push(5);
		System.out.println(Arrays.toString(arr));
		push(6);
		System.out.println(Arrays.toString(arr));
		push(7);
		System.out.println(Arrays.toString(arr));
		
		System.out.println( pop() );
		System.out.println( pop() );
		System.out.println( pop() );
		System.out.println( pop() );
		System.out.println( pop() );
		System.out.println( pop() );
		System.out.println( pop() );
		System.out.println( pop() );
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] arr = {1,2,3};	// 선언을 main 밖 class 안에서 함
	
	static void push(int data) {
		//뒤에 값을 하나 추가
		int[] temp = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[temp.length - 1] = data;
		arr = temp;
		temp = null;		
	}
	
	// pop - 특정 요소를 마지막에서 삭제, 반환 - 삭제된 데이터를 반환
	static int pop() {
		
		if(arr.length > 0) {
			// 1. 삭제할 데이터를 백업
			int data = arr[arr.length - 1];
			// 2. arr.length - 1 크기의 사본 배열을 만든다.
			int[] temp = new int[arr.length - 1];
			// 3. 값을 복사
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i];
			}
			// 4. 원본배열을 바꾼다.
			arr = temp;
			temp = null;
			// 5. 삭제된 데이터를 반환한다.
			return data;
		}		
		
		return 0;
	}

}
