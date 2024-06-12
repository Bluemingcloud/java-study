package programmers.level0Page04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Problem181861 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String str = br.readLine().replace("[", "").replace("]", "");
		st = new StringTokenizer(str, ", ");
		int[] arr1 = new int[st.countTokens()];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		
//		int result = solution(arr1);
//		System.out.println(result);
		int[] result = solution(arr1);
		System.out.println(Arrays.toString(result));	
	}
    private static int[] solution(int[] arr) {
    	List<Integer> x = new ArrayList<Integer>();
    	for(int a : arr) {
    		for(int i = 0; i < a; i++) {
    			x.add(a);
    		}
    	}
    	
    	int[] answer = new int[x.size()];
    	for(int i = 0; i < answer.length; i++) {
    		answer[i] = x.get(i);
    	}
    	return answer;     	
    }

}
