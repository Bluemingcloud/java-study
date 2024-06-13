package programmers.level0Page08;

import java.util.Arrays;

public class Problem181857 {
    public int[] solution(int[] arr) {
    	int length = arr.length;
    	for(int i = 0; i <= 10; i++) {
    		if(Math.pow(2, i) >= length) {
    			length = (int)Math.pow(2, i);
    			break;
    		}
    	}

        return Arrays.copyOf(arr, length);
    }

}
