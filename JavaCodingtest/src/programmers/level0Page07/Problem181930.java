package programmers.level0Page07;

public class Problem181930 {
	class Solution {
	    public int solution(int a, int b, int c) {
	        int answer = 1;
	        int n = 0;
	        if(a == b && a == c) {
	            n = 3;
	        } else if (a != b && a != c && b != c) {
	            n = 1;
	        } else {
	            n = 2;
	        }
	        
	        for(int i = 1; i <= n; i++) {
	            answer *= (int)(Math.pow(a,i) + Math.pow(b,i) + Math.pow(c,i));
	        }
	        
	        return answer;
	    }
	}

}
