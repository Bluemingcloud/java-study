package quiz06;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz26 {
	public static void main(String[] args) {
		
		/*
		 *  배열의 앞에 data 를 추가하려고 합니다.
		 * 
		 *  1. 새로운 배열 + 1 생성합니다.
		 *  2. 기존 배열을 다음 인덱스번째로 옮겨담는다.
		 *  3. 0 번째에 data 를 추가한다.
		 * 
		 */
		
		int[] arr = {10,20,30,40,50};
		int data = 100;
		
		int[] newArr = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			newArr[i+1] = arr[i];
		}
		newArr[0] = data;
		System.out.println(Arrays.toString(newArr));		
		
		ArrayList<Integer> newList = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			newList.add(arr[i]);
		}
		// 리스트이름.add(인덱스, 값);
		newList.add(0, data);
		System.out.println(newList);
	}

}
