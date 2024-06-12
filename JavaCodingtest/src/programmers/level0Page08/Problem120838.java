package programmers.level0Page08;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem120838 {
	
    public static String solution(String letter) {
    	String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',"
    			+ "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',"
    			+ "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',"
    			+ "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'";
    	
    	String p = "'([^a-z]{1,4})':'[a-z]',?";
    	String[] arr = new String['z' - 'a' + 1];
    	Matcher m = Pattern.compile(p).matcher(morse);
    	int idx = 0;
    	while(m.find()) {
    		arr[idx] = m.group(1);
    		idx++;
    	}

    	String[] letters = letter.split(" ");
    	
    	StringBuilder sb = new StringBuilder();    	
    	for(String l : letters) {
    		for(int i = 0; i < arr.length; i++) {
    			if(l.equals(arr[i])) {
    				sb.append((char)(i + 'a'));
    			}
    		}
    	}

        return sb.toString();
    }
    public static void main(String[] args) {
    	String str = ".... . .-.. .-.. ---";
    	String s = solution(str);
	}

}
