package dpAlgorithm;

import java.util.Arrays;

public class Fibonacci2 {

	public static void main(String[] args) {
		int N = 10;
		
		int[] arr = new int[N];		
		arr[0] = 1;
		arr[1] = 1;
		
		int cnt = 0;
		for(int i = 2; i < N; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			cnt++;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(cnt);
	}
}
