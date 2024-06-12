package programmers.level0Page08;

import java.util.*;

public class Problem181860 {
	
    public int[] solution(int[] arr, boolean[] flag) {
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    deque.offerLast(arr[i]);
                }
            } else {
                for(int j = 0; j < arr[i]; j++) {
                    deque.pollLast();
                }
            }
        }
        int[] answer = new int[deque.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = deque.poll();
        }
        return answer;
    }
    
    public int[] solution2(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    stack.push(arr[i]);
                }
            } else {
                for(int j = 0; j < arr[i]; j++) {
                    stack.pop();
                }
            }
        }
        int[] answer = new int[stack.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
    

}
