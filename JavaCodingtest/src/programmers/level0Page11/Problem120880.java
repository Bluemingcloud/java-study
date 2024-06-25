package programmers.level0Page11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem120880 {
	
	/*
	 * 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 
	 * 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 
	 * 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 
	 * 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
	 * 
	 *  1 ≤ n ≤ 10,000
		1 ≤ numlist의 원소 ≤ 10,000
		1 ≤ numlist의 길이 ≤ 100
		numlist는 중복된 원소를 갖지 않습니다.
	 */
	
    public int[] solution(int[] numlist, int n) {
        Integer[] arr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        Arrays.sort(arr, new Comparator<Integer>() {
        	@Override
        	public int compare(Integer o1, Integer o2) {
        		if(Math.abs(o1.intValue() - n) == Math.abs(o2.intValue() - n)) {
        			return o1.intValue() - o2.intValue();
        		}
        		return Math.abs(o1.intValue() - n) - Math.abs(o2.intValue() - n);
        	}
        });
        
 
        
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
    
    // 선택 정렬
    public int[] solution2(int[] numlist, int n) {
    	
    	int[] answer = new int[numlist.length];
    	
    	for(int i = 0; i < answer.length - 1; i++) {
    		
    		int a = Math.abs(numlist[i] - n);
    		
    		for(int j = i + 1; j < numlist.length; j++) {
    		
    			int b = Math.abs(numlist[j] - n);
    			
    			if(a > b || (a == b && numlist[i] < numlist[j])) {
    				
    				int temp = numlist[i];
    				numlist[i] = numlist[j];
    				numlist[j] = temp;
    				
    			}
    			
    		}
    	}
    	
    	return numlist;

    }
    // 버블 정렬
    public int[] solution3(int[] numlist, int n) {
    	
    	for(int i = 0; i < numlist.length - 1; i++) {
    		for(int j = i + 1; j < numlist.length; j++) {
                
    		  int a = Math.abs(numlist[j - 1] - n);
    			int b = Math.abs(numlist[j] - n);
    			if(a > b || (a == b && numlist[j - 1] < numlist[j])) {
    				
    				int temp = numlist[j];
    				numlist[j] = numlist[j - 1];
    				numlist[j - 1] = temp;
	
    			}
    			
    		}
    	}	
    	return numlist;
    }
    
    public int[] solution4(int[] numlist, int n) {
    	
    	PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
    		@Override
    		public int compare(Integer o1, Integer o2) {
    			if(Math.abs(o1.intValue() - n) == Math.abs(o2.intValue() - n)) return o2.intValue() - o1.intValue();
    			return Math.abs(o1.intValue() - n) - Math.abs(o2.intValue() - n);
    		}
		});
    	
    	for(int num : numlist) {
    		queue.offer(num);
    	}
    	
    	return queue.stream().mapToInt(Integer::intValue).toArray();
    }

}
