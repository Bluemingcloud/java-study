package programmers.level0Page09;

import java.util.*;

public class Problem181871 {
	
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i <= myString.length() - pat.length(); i++) {
        	if(myString.substring(i,i + pat.length()).equals(pat)) {
        		answer++;
        	}
        }
        return answer;
    }

	
}
