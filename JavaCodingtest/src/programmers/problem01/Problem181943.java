package programmers.problem01;

public class Problem181943 {
	
	public static void main(String[] args) {
		
	}
	
	public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer = my_string.replace(my_string.substring(s,overwrite_string.length() + s), overwrite_string);
        
        return answer;
    }

}
