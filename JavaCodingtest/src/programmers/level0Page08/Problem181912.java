package programmers.level0Page08;
import java.util.*;

public class Problem181912 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        StringBuilder sb = new StringBuilder();
        for(String str : intStrs) {
            int end = s + l > str.length() ? str.length() : s + l;
            if(str.substring(s,end).compareTo("" + k) > 0) {
                sb.append(str.substring(s,end) + " ");
            }
        }
        StringTokenizer st = new StringTokenizer(sb.toString());
        int[] answer = new int[st.countTokens()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(st.nextToken());
        }
        return answer;
    }
    
    public int[] solution2(String[] intStrs, int k, int s, int l) {

    	List<Integer> list = new ArrayList<>();
        for(String str : intStrs) {
            int num = Integer.parseInt(str.substring(s, s + l));
            if(k < num) {
            	list.add(num);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
