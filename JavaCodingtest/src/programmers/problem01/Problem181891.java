package programmers.problem01;

import java.util.Arrays;

public class Problem181891 {
	public static void main(String[] args) {
		
		int[] arr1 = {2,1,6};	// 1 6 2
		int n1 = 1;				// 1 2 0
								// 0 1 2
		
		int[] arr2 = {5,2,1,7,5};	// 7 5 5 2 1
					//0 1 2 3 4		// 3 4 0 1 2
									// 0 1 2 3 4
		int n2 = 3;
		
		System.out.println(Arrays.toString(solution(arr1,n1)));
		System.out.println(Arrays.toString(solution(arr2,n2)));
		
	}
	static int[] solution(int[] num_list, int n) {
	    int[] answer = new int[num_list.length];
	    for(int i = 0; i < num_list.length; i++) {
	    	
	    	if(i < num_list.length - n) {
	    		answer[i] = num_list[n + i];
	    	} else {
	    		answer[i] = num_list[i - (num_list.length - n)];
	    	}
	    }
	    
	    return answer;
	}
}
