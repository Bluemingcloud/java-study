package programmers.level0Page04;

public class Problem181864Second {
	
	public static void main(String[] args) {
		
	}
    private int solution(String myString, String pat) {
        String str = pat.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(str) ? 1 : 0;
    }
}
