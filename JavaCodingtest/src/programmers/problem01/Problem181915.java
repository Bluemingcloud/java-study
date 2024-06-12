package programmers.problem01;

public class Problem181915 {
	
	public static void main(String[] args) {
		
	}
	
	static String solution(String my_string, int[] index_list) {
		
        String answer = "";
        
        for(int index : index_list) {
        	answer += my_string.charAt(index);
        }        
        return answer;

	}

}
