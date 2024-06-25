package programmers.level0Page11;

public class Problem120871 {
	
    public int solution(int n) {
    	
        int[] arr = new int[n];
        
        int num = 0;
        int idx = 0;
        while(idx < arr.length) {
        	if(num++ % 3 == 0) continue;
        	arr[idx++] = num;
        }
        
        
        return arr[n - 1];
    }

}
