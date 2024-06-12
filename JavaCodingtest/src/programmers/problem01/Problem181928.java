package programmers.problem01;

public class Problem181928 {
	
	public static void main(String[] args) {
		
	}
	
    public static int solution(int[] num_list) {
        int answer = 0;
        int even = -1;
        int odd = -1;
        for(int i = num_list.length - 1; i >= 0; i--) {
            int temp = 1;
            if(num_list[i] % 2 == 0) {
                even++;
                for(int j = 0; j < even; j++) {
                    temp *= 10;
                }
                answer += temp * num_list[i];
            } else {                
                odd++;
                for(int j = 0; j < odd; j++) {
                    temp *= 10;
                }
                answer += temp * num_list[i];
            }
        }
        return answer;
	}

}
