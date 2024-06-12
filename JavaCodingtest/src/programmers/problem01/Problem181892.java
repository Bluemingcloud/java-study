package programmers.problem01;

import java.util.Arrays;

public class Problem181892 {
	public static void main(String[] args) {
		
		
		
	}
	static int[] solution(int[] num_list, int n) {
	    int[] answer = new int[num_list.length - n + 1];
	    for(int i = 0; i < answer.length; i++) {
	    	answer[i] = num_list[i + n - 1];
	    }
	    
	    return answer;
	}
}
