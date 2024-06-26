package programmers.level0Page11;

import java.util.*;

public class Problem181893 {
	
    public int[] solution(int[] arr, int[] query) {
    	
        Deque<Integer> queue = new LinkedList<Integer>();
        for(int a : arr) {
        	queue.offer(a);
        }
        
        for(int i = 0; i < query.length; i++) {
        	if(i % 2 == 0) {
        		while(queue.size() > queue.size() - query[i]) {
        			queue.pollLast();
        		}
        	} else {
        		while(queue.size() > queue.size() - query[i]) {
        			queue.pollFirst();
        		}
        	}
        }
        
    	
    	return queue.stream().mapToInt(Integer::intValue).toArray();

    }
    
    public int[] solution2(int[] arr, int[] query) {
    	
        int start = 0;
        int end = arr.length;
        
        for(int i = 0; i < query.length; i++) {
        	if(i % 2 == 0) start += query[i];
        	else end -= query[i];
        }
        
        return Arrays.copyOfRange(arr, start, end);

    }

}
