package day06;

public class ArraySearch {
	
	public static void main(String[] args) {
		
		// 탐색(순회) : 값을 찾는 방법
		// 순차 탐색
		
		int[] arr = {1,3,4,10,20,50,80,100};
		int find = 60;	// 찾을 값
		int findIndex = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == find) {
				findIndex = i;
				break;
			}
		}
 		if(findIndex != -1) {
 			System.out.println(find + " 은(는) " + findIndex + " 번째 인덱스에 있습니다.");
 		} else {
 			System.out.println(find + " 은(는) 없습니다.");
 		}
	}
}
