class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.replace("a", " ").replace("b", " ").replace("c", " ").trim().replaceAll("\\s+", " ").split(" ");
        return answer[0].equals("") ? new String[] {"EMPTY"} : answer;
    }
}