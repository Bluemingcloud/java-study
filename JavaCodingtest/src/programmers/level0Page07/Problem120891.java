package programmers.level0Page07;

public class Problem120891 {
	
    public int solution(int order) {
        int answer = 0;
        while(order > 0) {
            int num = order % 10;
            if(num == 3 || num == 6 || num == 9) answer++;
            order /= 10;
        }
        return answer;
    }

}