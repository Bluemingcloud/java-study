package programmers.level0Page04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem181868 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int[] arr = scanIntArr(br.readLine());
		String str = scanStr(br.readLine());
//		int[] result = solution(arr);
		String[] result = solution(str);
		System.out.println(Arrays.toString(result));	
	}
    private static String[] solution(String my_string) {
        my_string = my_string.trim().replace(" ", ",");

        StringTokenizer st = new StringTokenizer(my_string, ",");
        List<String> list = new ArrayList<>();
        while(st.hasMoreTokens()) {
        	list.add(st.nextToken());
        }
        String[] answer = list.toArray(new String[0]);        
        
        return answer;        
    }
    
    private static int[] scanIntArr(String str) throws IOException {
    	str = str.replace("[", "").replace("]", "");
    	StringTokenizer st = new StringTokenizer(str, ", ");
    	int[] arr = new int[st.countTokens()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		return arr;
    }
    
    private static String[] scanStrArr(String str) throws IOException {
    	str = str.replace("[", "").replace("]", "");
    	StringTokenizer st = new StringTokenizer(str);
    	String[] arr = new String[st.countTokens()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = st.nextToken();
		}
		return arr;
    }
    
    private static int scanInt(String str) throws IOException {
    	str = str.replace("[", "").replace("]", "").replace("\"", "");
    	int result = Integer.parseInt(str);
    	return result;
    }
    
    private static String scanStr(String str) throws IOException {
    	str = str.replace("[", "").replace("]", "").replace("\"", "");
    	return str;
    }

}
