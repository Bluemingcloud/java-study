package programmers.level0Page07;

public class Problem181898 {
	
    public int solution(int[] arr, int idx) {
        
        for(int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) return i;
        }
        return -1;
        
    }

}
