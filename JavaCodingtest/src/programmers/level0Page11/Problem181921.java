package programmers.level0Page11;
import java.util.*;
public class Problem181921 {
	
    public int[] solution(int l, int r) {
        
        List<Integer> list = new ArrayList<>();

        int p = 1;
        int i = 5;
        while(i <= r) {
        	
        	if(i >= l) list.add(i);
        	i *= Integer.parseInt(Integer.toBinaryString(p++));
        	
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }

}
