package programmers.level0Page07;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Problem120888 {
    public String solution(String my_string) {
    	List<Character> list = new ArrayList<Character>();
    	for(int i = 0; i < my_string.length(); i++) {
    		if(!list.contains(my_string.charAt(i))) list.add(my_string.charAt(i));
    	}
    	StringBuilder sb = new StringBuilder();
    	for(char c : list) {
    		sb.append(c);
    	}
        return sb.toString();
    }
    
    
    // LinkedHashSet
    public String solution2(String my_string) {
    	Set<Character> set = new LinkedHashSet<>();
    	for(int i = 0; i < my_string.length(); i++) {
    		set.add(my_string.charAt(i));
    	}
    	StringBuilder sb = new StringBuilder();
    	for(char c : set) {
    		sb.append(c);
    	}
        return sb.toString();
    }
    
    // stream Collectors.joining()
    public String solution3(String my_string) {
        return "";
    }

}
