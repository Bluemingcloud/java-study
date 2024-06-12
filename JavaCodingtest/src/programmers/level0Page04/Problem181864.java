package programmers.level0Page04;

public class Problem181864 {
	
	public static void main(String[] args) {
		
	}
    private int solution(String myString, String pat) {
        String str = "";
        for(int i = 0; i < pat.length(); i++) {
            if(pat.charAt(i) == 'A') {
                str += "B";
            } else {
                str += "A";
            }
        }
        return myString.contains(str) ? 1 : 0;
    }
}
