package programmers.level0Page07;

public class Problem181931 {
	
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = a;
        for(boolean chk : included) {
            if(chk) {
                answer += num;
            }
            num += d;
        }
        
        return answer;
    }

}
