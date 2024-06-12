package programmers.level0Page04;

public class Problem181854 {
	
	public static void main(String[] args) {
		
	}
    private static int[] solution(int[] arr, int n) {
        return arr.length % 2 == 0 ? addArr(1, n, arr) : addArr(0, n, arr);        
    }
    private static int[] addArr(int start, int n, int[] arr) {
        for(int i = start; i < arr.length; i += 2) {
            arr[i] = arr[i] + n;
        }
        return arr;
    }
}
