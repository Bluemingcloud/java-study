package programmers.level0Page04;

public class Problem181854Third {
	
	public static void main(String[] args) {
		
	}
    private static int[] solution(int[] arr, int n) {
        
        for(int i = arr.length - 1; i >= 0 ; i -= 2) {
        	arr[i] += n; 
        }
        return arr;
    }
}
