package dpAlgorithm;

import java.util.Arrays;

public class Fibonacci {
	
	static int cnt;
	
	private static int makeFibonacci(int a) {
		cnt++;
		if(a <= 1) {
			return a;
		}
		return makeFibonacci(a - 1) + makeFibonacci(a - 2);
	}

	public static void main(String[] args) {
		int N = 10;
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = makeFibonacci(i + 1);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(cnt);
	}
}
