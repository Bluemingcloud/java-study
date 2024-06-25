package programmers.level0Page11;

import java.util.HashMap;
import java.util.Map;

public class Problem181851 {
	
    public int solution(int[] rank, boolean[] attendance) {
        
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for(int i = 0; i < rank.length && attendance[i]; i++) {
    		map.put(rank[i], i);    		
    	}
    	
    	int cnt = 0;
    	int num = 10000;
    	int answer = 0;
    	for(int i = 1; i <= rank.length && map.containsKey(i) && cnt != 3; i++) {

    		answer += map.get(i) * num;
    		cnt++;
    		num /= 100;

    	}
        
    	return answer;
        
    }

}
