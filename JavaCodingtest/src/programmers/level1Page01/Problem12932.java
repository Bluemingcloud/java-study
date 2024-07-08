package programmers.level1Page01;
import java.util.*;
public class Problem12932 {
    List<Long> list = new ArrayList<>();
    public int[] solution(long n) {
        if(list.size() == n) return list.stream().mapToInt(Long::intValue).toArray();
        list.add(n % 10);

        return solution(n / 10);
    }
}
