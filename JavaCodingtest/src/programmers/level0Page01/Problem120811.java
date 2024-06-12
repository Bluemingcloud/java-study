package programmers.level0Page01;

import java.util.Arrays;

public class Problem120811 {
	
	public static void main(String[] args) {
		
	}
	
	public static int solution(int[] array) {
		Arrays.sort(array);
		return array[array.length / 2];
	}

}
