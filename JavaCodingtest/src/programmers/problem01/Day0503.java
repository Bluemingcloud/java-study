package programmers.problem01;

public class Day0503 {
	
	public static void main(String[] args) {
		
		int i = 3;
		int a = (int)(Math.pow(i, 2));
		System.out.println(a);		
		
	}
	public int solution(int a, int b, int c) {
        int answer = 1;
        double n = 0;
        if(a == b && a == c) {
            n = 2;
        } else if (a != b && a != c && b != c) {
            n = 0;
        } else {
            n = 1;
        }
        
        for(int i = 0; i < n; i++) {
            answer *= Math.pow(i,a) + Math.pow(i,b) + Math.pow(i,c);
        }
        
        return answer;
    }
}

