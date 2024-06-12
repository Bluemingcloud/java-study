package programmers.level0Page07;

import java.util.*;

public class Problem120850 {
	
	public int[] solution(String my_string) {
        char[] arr = my_string.toCharArray();
        List<Integer> list = new ArrayList<>();
        
        for(char c : arr) {
            if('0' <= c && c <= '9') list.add(Integer.parseInt("" + c));
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
	
    public int[] solution2(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        for(char i = '0'; i <= '9'; i++) {
            for(int j = 0; j < my_string.length(); j++) {
                if(my_string.charAt(j) == i) list.add(Integer.parseInt("" + i));
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }

}
