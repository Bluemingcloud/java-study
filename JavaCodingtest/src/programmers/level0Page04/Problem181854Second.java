package programmers.level0Page04;

public class Problem181854Second {
	
	public static void main(String[] args) {
		
	}
    private static int[] solution(int[] arr, int n) {
        
        int idx = arr.length % 2 == 0 ? 1 : 0;
        for(int i = idx; i < arr.length; i+= 2) {
        	arr[i] += n; 
        }
        return arr;
    }
}