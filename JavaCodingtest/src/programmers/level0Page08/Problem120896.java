package programmers.level0Page08;

import java.util.*;

public class Problem120896 {
    public static String solution(String s) {
        
    	char[] arr = s.toCharArray();
    	Arrays.sort(arr);
    	boolean[] flags = new boolean[26];
    	
    	List<String> list = new ArrayList<String>();
    	for(int i = 0; i < arr.length; i++) {
    		if(flags[arr[i] - 'a']) {
    			if(list.contains(String.valueOf(arr[i]))) list.remove(String.valueOf(arr[i]));
    		} else {
    			list.add(String.valueOf(arr[i]));
    			flags[arr[i] - 'a'] = true;
    		}
    	}
    	
        return list.toString().replaceAll("[^a-z]+", "");
    }
    
    public static void main(String[] args) {
		System.out.println(solution("test"));
	}

}
