package programmers.level0Page06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem181887 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = scanIntArr(br.readLine());

//		int[] result = solution(arr);
		int result = solution(arr);
		System.out.println(result);
//		System.out.println(Arrays.toString(result));	
	}
    private static int solution(int[] num_list) {
        
        int sumOdd = 0;
        int sumEven = 0;
        int idx = 0;
        for(int num : num_list) {
        	if(idx % 2 == 0) {
        		sumEven += num;
        	} else {
        		sumOdd += num;
        	}
            idx++;
        }
        return Math.max(sumEven, sumOdd);
        
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
