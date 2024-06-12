package programmers.problem01;

public class Problem181929 {
	
	public static void main(String[] args) {
		
	}
	
    public static int solution(int[] num_list) {
        
        int sum = 0;
        int times = 1;
        
        for(int num : num_list) {
        	sum += num;
        	times *= num;
        }
        
        if(sum * sum > times) {
        	return 1;
        } else {
        	return 0;
        }
        
    }

}
