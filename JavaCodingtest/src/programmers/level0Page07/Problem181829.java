package programmers.level0Page07;

public class Problem181829 {
	public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; i + j <= k && j < board[i].length; j++) {
                answer += board[i][j];
            }
        }
        return answer;
    }

}
