package programmers.level0Page05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class Problem181885 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int[] arr = scanIntArr(br.readLine());
		
//		int[] result = solution(arr);
		
		String[] todo_list = scanStrArr(br.readLine());
		boolean[] finished = scanBoolArr(br.readLine());
		
		String[] result = solution(todo_list, finished);
		
		System.out.println(Arrays.toString(result));	
	}
    private static String[] solution(String[] todo_list, boolean[] finished) {
        
    	List<String> list = new ArrayList<>();
    	
    	for(int i = 0; i < finished.length; i++) {
    		if(!finished[i]) {
    			list.add(todo_list[i]);
    		}    		
    	}
                
        return list.toArray(new String[list.size()]); 
        
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
    
    private static boolean[] scanBoolArr(String str) throws IOException {
    	str = str.replace("[", "").replace("]", "");
    	StringTokenizer st = new StringTokenizer(str, ", ");
    	boolean[] arr = new boolean[st.countTokens()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Boolean.parseBoolean(st.nextToken());
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
