package programmers.level0Page08;

public class Problem120887 {
	
    public int solution(int i, int j, int k) {
    	StringBuilder sb = new StringBuilder();
    	for(int num = i; num <= j; num++) {
            sb.append(String.valueOf(i));
        }
    
        return sb.toString().replaceAll("[^" + k + "]", "").length();
    }
    public int solution2(int i, int j, int k) {
    	
    	int answer = 0;
    	
    	for(int num = i; num <= j; num++) {
    		int temp = num;
    		while(temp != 0) {
    			if(temp % 10 == k) answer++;
    			temp /= 10;
    		}
    	}
    
        return answer;
    }

}
