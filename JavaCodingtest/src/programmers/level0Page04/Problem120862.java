package programmers.level0Page04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem120862 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String str = br.readLine().replace("[", "").replace("]", "");
		st = new StringTokenizer(str, ", ");
		int[] arr1 = new int[st.countTokens()];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int result = solution(arr1);

		System.out.println(result);	
	}
    private static int solution(int[] numbers) {
    	
    	Arrays.sort(numbers);
    	int a = numbers[0] * numbers[1];
    	int b = numbers[numbers.length - 1] * numbers[numbers.length - 2];
    	return Math.max(a, b);
    	
    	
    }

}
