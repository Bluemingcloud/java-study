package programmers.level1Page03;

public class Problem134240 {
    
	
	public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < food.length; i++) {
        	sb.append(String.valueOf(i).repeat(food[i] / 2));
        }
        StringBuilder answer = new StringBuilder(sb);
        answer.append(0).append(sb.reverse());
        
        return answer.toString();
    }
	
	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		solution(food);
	}
}
