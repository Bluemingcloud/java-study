package programmers.level0Page05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem181875 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int[] arr = scanIntArr(br.readLine());
		
//		int[] result = solution(arr);
		
		String[] strArr = scanStrArr(br.readLine());
		
		String[] result = solution(strArr);
		
		
		System.out.println(Arrays.toString(result));	
	}
    private static String[] solution(String[] strArr) {
        for(int i = 0; i < strArr.length; i++) {
        	strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }
        return strArr;
        
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
    	StringTokenizer st = new StringTokenizer(str, ", ");
    	String[] arr = new String[st.countTokens()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = st.nextToken();
		}
		return arr;
    }
    
    private static int scanInt(BufferedReader br) throws IOException {
    	String str = br.readLine();
    	str = str.replace("[", "").replace("]", "").replace("\"", "");
    	int result = Integer.parseInt(str);
    	return result;
    }
    
    private static String scanStr(BufferedReader br) throws IOException {
    	String str = br.readLine();
    	str = str.replace("[", "").replace("]", "").replace("\"", "");
    	return str;
    }

}
