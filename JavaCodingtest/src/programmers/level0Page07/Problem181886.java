package programmers.level0Page07;

public class Problem181886 {
	
	public String[] solution(String[] names) {
        int n = 0;
        if(names.length % 5 == 0) {
            n = names.length / 5;
        } else {
            n = names.length / 5 + 1;
        }
        String[] answer = new String[n];
        for(int i = 0; i < names.length; i += 5) {
            answer[i / 5] = names[i];
        }
        return answer;
    }

}
