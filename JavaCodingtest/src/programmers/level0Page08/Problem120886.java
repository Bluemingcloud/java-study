package programmers.level0Page08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Problem120886 {
    public static int solution(String before, String after) {

        List<Character> list = new ArrayList<>();
        for(int i = 0; i < before.length(); i++) {
        	list.add((Character)before.charAt(i));
        }
        for(int i = 0; i < after.length(); i++) {
            if(list.size() == 0) return 0;
        	list.remove((Character)after.charAt(i));
            
        }
       
        return list.size() == 0 ? 1 : 0;
    }
    
    public static int solution2(String before, String after) {
    	
    	char[] charBefore = before.toCharArray();
    	char[] charAfter = after.toCharArray();
    	
    	Arrays.sort(charBefore);
    	Arrays.sort(charAfter);
    	
    	return String.valueOf(charBefore).equals(String.valueOf(charAfter)) ? 1 : 0;
    }
    
    public static void main(String[] args) {
		System.out.println(solution("olleh", "hello"));
	}

}
