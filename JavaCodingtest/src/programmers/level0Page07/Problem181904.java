package programmers.level0Page07;

public class Problem181904 {
	
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for(int i = c - 1; i < my_string.length(); i += m) {
            sb.append("" + my_string.charAt(i));
        }
        return sb.toString();
    }

}
