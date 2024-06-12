package programmers.level0Page08;

public class Problem181883 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries) {
        	for(int i = query[0]; i <= query[1]; i++) {
        		arr[i]++;
        	}
        }
        return arr;
    }

}
