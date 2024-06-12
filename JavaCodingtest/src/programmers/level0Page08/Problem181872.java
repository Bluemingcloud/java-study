package programmers.level0Page08;

public class Problem181872 {
	
    public String solution(String myString, String pat) {
        String answer = "";
        int i = myString.lastIndexOf(pat);
        answer += myString.substring(0, i);
        
        return answer + pat;
    }
    
    public String solution2(String myString, String pat) {
        StringBuilder sb = new StringBuilder(myString.substring(0, myString.lastIndexOf(pat)));
        return sb.append(pat).toString();
    }

}
