package programmers.level0Page09;

import java.util.*;

public class Problem181855 {
	
    public int solution(String[] strArr) {
        int[] count = new int[31];
        for(String str : strArr) {
            count[str.length()]++;
        }
        return Arrays.stream(count).max().getAsInt();
    }

	
}
