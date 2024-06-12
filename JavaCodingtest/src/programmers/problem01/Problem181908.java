package programmers.problem01;

import java.util.Arrays;

public class Problem181908 {
	public static void main(String[] args) {
		
		
		
	}
	static int solution(String my_string, String is_suffix) {
		for(int i = 0; i < my_string.length(); i ++) {
			if(my_string.substring(i).equals(is_suffix)) {
				return 1;
			}
		}
		return 0;
	}
}
