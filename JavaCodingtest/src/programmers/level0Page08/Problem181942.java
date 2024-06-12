package programmers.level0Page08;

public class Problem181942 {
	
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i = 0; i < str1.length() + str2.length(); i++) {
            if(i % 2 == 0) {
                answer += str1.charAt(i / 2);
            } else {
                answer += str2.charAt(i / 2);
            } 
        }
        return answer;
    }
    
    public String solution2(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(int i = 0; i < str1.length() + str2.length(); i++) {
            if(flag) {
            	sb.append(str1.charAt(i / 2));
            	flag = false;
            } else {
            	sb.append(str2.charAt(i / 2));
            	flag = true;
            }
        }
        return sb.toString();
    }
    
    public String solution3(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return sb.toString();
    }

}
