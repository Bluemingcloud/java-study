package programmers.level1Page03;

import java.util.*;

public class Problem12915 {
	
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (str1, str2) -> {
        	if(str1.charAt(n) == str2.charAt(n)) return str1.compareTo(str2);
        	return str1.charAt(n) - str2.charAt(n);
        });
        
        
        return strings;
    }	
    
    public String[] solution2(String[] strings, int n) {

    	return Arrays.stream(strings)
    			.sorted((str1, str2) -> str1.charAt(n) == str2.charAt(n) ? str1.compareTo(str2) : str1.charAt(n) - str2.charAt(n))
    			.toArray(String[]::new);
        
    }
    
    public static String[] solution3(String[] strings, int n) {

    	for(int i = 0; i < strings.length; i++) {
    		for(int j = i + 1; j < strings.length; j++) {
    			if(strings[i].charAt(n) == strings[j].charAt(n) && strings[i].compareTo(strings[j]) > 0) {
    				String temp = strings[i];
    				strings[i] = strings[j];
    				strings[j] = temp;
    			} else {
    				if(strings[i].charAt(n) > strings[j].charAt(n)) {
    					String temp = strings[i];
    					strings[i] = strings[j];
    					strings[j] = temp;
    				}
    			}
    		}
    	}
    	return strings;
        
    }
    
    public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
    	System.out.println(Arrays.toString(solution3(strings, 2)));
    	
	}

}
