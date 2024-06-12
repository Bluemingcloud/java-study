package programmers.level0Page08;

public class Problem120848 {
	
    public int solution(int n) {

        int[] arr = new int[10];
        arr[0] = 1;
        for(int i = 1; i < 10; i++) {
            arr[i] = arr[i - 1] * (i + 1);
        }
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == n) return i + 1;
        	if(arr[i - 1] < n && n < arr[i]) return i;
        }
        
        return 1;
    }
    
    public int solution2(int n) {
        
    	int fac = 1;
    	int idx = 1;
        while(fac < n) {
        	fac *= ++idx;       	
        }
        
        return fac == n ? idx : idx - 1;
    }
}
