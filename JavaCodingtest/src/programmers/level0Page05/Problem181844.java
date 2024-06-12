package programmers.level0Page05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem181844 {
	
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

    	List<Integer> list = new ArrayList<>();
    	
    	for(int a : arr) {
    		list.add(a);
    	}
    	for(int d : delete_list) {
    		if(list.contains(d)) {    			
    			list.remove(list.indexOf(d));
    		}
    	}
    	
    	int[] answer = new int[list.size()];
    	for(int i = 0; i < answer.length; i++) {
    		answer[i] = list.get(i);
    	}
    	
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
