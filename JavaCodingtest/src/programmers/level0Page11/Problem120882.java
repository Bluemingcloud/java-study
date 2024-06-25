package programmers.level0Page11;

public class Problem120882 {
	/*
	 * 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 
	 * 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 
	 * 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
	 */
    public int[] solution(int[][] score) {        
        
        int[] answer = new int[score.length];
        int rank = 1;
        
        for(int i = 100; i >= 0; i -= 5) {
        	int cnt = 0;
        	for(int j = 0; j < score.length; j++) {
        		if((score[j][0] + score[j][1]) / 2 == i) {
        			answer[j] = rank;
        			cnt++;
        		}
        	}
        	rank += cnt;
        	
        }
        
        return answer;
    }

}
