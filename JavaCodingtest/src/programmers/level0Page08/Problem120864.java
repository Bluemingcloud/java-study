package programmers.level0Page08;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem120864 {
    public int solution(String my_string) {
    	int answer = 0;
    	Matcher m = Pattern.compile("[0-9]+").matcher(my_string);

        while(m.find()) {
        	answer += Integer.parseInt(m.group());
        }
        return answer;
    }
    
    // replaceAll
    public int solution2(String my_string) {
    	int answer = 0;
    	my_string = my_string.replaceAll("[a-zA-Z]+", " ");
    	StringTokenizer st = new StringTokenizer(my_string);

        while(st.hasMoreTokens()) {
        	answer += Integer.parseInt(st.nextToken());
        }
        return answer;
    }

}
