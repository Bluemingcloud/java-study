package programmers.level0Page08;

public class Problem120842 {

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int idx = 0;
        for(int i = 0; i < answer.length; i++) {
        	for(int j = 0; j < answer[i].length; j++) {
        		answer[i][j] = num_list[idx];
        		idx++;
        	}
        }
        return answer;
    }
    
    public int[][] solution2(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for(int i = 0; i < num_list.length; i++) {
        	answer[i / n][i % n] = num_list[i];
        }
        return answer;
    }

}
