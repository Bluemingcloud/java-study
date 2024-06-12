package programmers.level0Page08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem120890 {
	public int solution(int[] array, int n) {
	       
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        
        int small = n;
        int large = n;
        while(true) {
        	
        	if(list.contains(small)) {
                if(list.contains(large)) {
                    return large - n >= n - small ? small : large;
                } else {
                    return small;
                }
                
        	}
        	
        	if(list.contains(large)) {
                if(list.contains(small)) {
                    return large - n >= n - small ? small : large;
                } else {
                    return large;
                }
        	}
        	large++;
        	small--; 	
        }
    }
	
    public int solution2(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 1 ; i < array.length ; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }
	

}
