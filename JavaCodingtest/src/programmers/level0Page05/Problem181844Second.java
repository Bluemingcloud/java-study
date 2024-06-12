package programmers.level0Page05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class Problem181844Second {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = scanIntArr(br.readLine());
		int[] delete_list = scanIntArr(br.readLine());
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(delete_list));
    	
		int[] result = solution(arr, delete_list);

		System.out.println(Arrays.toString(result));	
	}
    private static int[] solution(int[] arr, int[] delete_list) {
    	
        return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();
        
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
