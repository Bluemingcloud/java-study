package programmers.level1Page01;
import java.util.*;

public class Problem12931 {
    int answer = 0;
    public int solution(int n) {

        if(n == 0) return answer;

        answer += n % 10;

        return solution(n / 10);
    }
}
