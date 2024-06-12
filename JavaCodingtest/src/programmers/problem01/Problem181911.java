package programmers.problem01;

public class Problem181911 {
	
	public static void main(String[] args) {
		
	}
	
	static String solution(String[] my_strings, int[][] parts) {
		String answer = "";
		for(int i = 0; i < my_strings.length; i++) {
			answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
		}
		return answer;
	}

}
