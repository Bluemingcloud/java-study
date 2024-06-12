package programmers.level0Page04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem120863 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = scanStr(br);
		
		String result = solution(str);

		System.out.println(result);	
	}
    private static String solution(String rny_string) {
    	
    	return rny_string.replace("m", "rn");	
    }
    
    private static int[] scanIntArr(BufferedReader br, StringTokenizer st) throws IOException {
    	String str = br.readLine();
    	str.replace("[", "").replace("]", "");
    	int[] arr = new int[st.countTokens()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		return arr;
    }
    
    private static String[] scanStrArr(BufferedReader br, StringTokenizer st) throws IOException {
    	String str = br.readLine();
    	str.replace("[", "").replace("]", "");
    	String[] arr = new String[st.countTokens()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = st.nextToken();
		}
		return arr;
    }
    
    private static int scanInt(BufferedReader br) throws IOException {
    	String str = br.readLine();
    	str.replace("[", "").replace("]", "").replace("\"", "");
    	int result = Integer.parseInt(str);
    	return result;
    }
    
    private static String scanStr(BufferedReader br) throws IOException {
    	String str = br.readLine();
    	str.replace("[", "").replace("]", "").replace("\"", "");
    	return str;
    }

}
