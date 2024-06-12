package programmers.level0Page04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem181856 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String str = br.readLine().replace("[", "").replace("]", "");
		st = new StringTokenizer(str, ", ");
		int[] arr1 = new int[st.countTokens()];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		str = br.readLine().replace("[", "").replace("]", "");
		st = new StringTokenizer(str, ", ");
		
		int[] arr2 = new int[st.countTokens()];
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = solution(arr1, arr2);

		System.out.println(result);	
	}
    private static int solution(int[] arr1, int[] arr2) {
        
        if(arr1.length > arr2.length) {
            return 1;
        }
        if(arr1.length < arr2.length) {
            return -1;
        }
        if(sumArr(arr1) > sumArr(arr2)) {
            return 1;
        }
        if(sumArr(arr1) < sumArr(arr2)) {
            return -1;
        }
        return 0;
    }
    
    private static int sumArr(int[] arr) {
        int sum = 0;
        for(int a : arr) {
            sum += a;
        }
        return sum;
    }

}
