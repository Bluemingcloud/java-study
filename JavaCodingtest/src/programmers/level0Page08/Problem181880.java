package programmers.level0Page08;

public class Problem181880 {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int num : num_list) {
            while((num /= 2) >= 1) {
                answer++;
            }
        }
        return answer;
    }

}
