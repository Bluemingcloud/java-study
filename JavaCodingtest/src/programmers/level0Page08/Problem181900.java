package programmers.level0Page08;

public class Problem181900 {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int i : indices) {
        	sb.deleteCharAt(i);
        	sb.insert(i, " ");
        }
        return sb.toString().replace(" ", "");
    }
}
