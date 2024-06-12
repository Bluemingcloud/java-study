package quiz05;

public class Quiz25 {
	
	public static void main(String[] args) {
		
		// 배열 요소 중 가장 큰 값 하나만 출력.
		int[] arr = {34, 65, 12, 34, 56, 100, 54, 21, 99};
		
		// 최솟값을 나타내는 실행문 : 타입.MIN_VALUE
		int max = Integer.MIN_VALUE;
		for(int a : arr) {
			if(a > max) {
				max = a;
			}
		}
		System.out.println(max);
	}
}
