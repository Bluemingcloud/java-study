package day15.api.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
	
	public static void main(String[] args) {
		
		// 양방향 큐 (양쪽 삽입 삭제)
		//ArrayDeque<Integer> deque = new ArrayDeque<>();
		Deque<Integer> queue = new ArrayDeque<>();
		
		// Deque 의 값 추가
		// offerLast()
		// 뒤에서 추가
		System.out.println("offerLast()");
		queue.offer(1);
		queue.offerLast(2);
		queue.offerLast(3);
		queue.offerLast(4);
		System.out.println(queue.toString());
		
		// offerFirst()
		// 앞에서 추가
		System.out.println("offerFirst()");
		queue.offerFirst(10);
		queue.offerFirst(20);
		queue.offerFirst(30);
		System.out.println(queue.toString());
		
		System.out.println();
		
		// Deque 의 값 삭제
		// pollLast()
		// 뒤에서 삭제
		System.out.println("pollLast()");
		System.out.println(queue.pollLast());
		System.out.println(queue.pollLast());
		System.out.println(queue.toString());
		
		// pollFirst()
		// 앞에서 삭제
		System.out.println("pollFirst()");
		System.out.println(queue.pollFirst());
		System.out.println(queue.pollFirst());
		System.out.println(queue.toString());
		
		System.out.println();
		
		// Deque 의 값 확인하기
		// peekLast()
		// 뒤에서 값 확인하기
		System.out.println("peekLast()");
		System.out.println(queue.peekLast());
		
		// peekFirst()
		// 앞에서 값 확인하기
		System.out.println("peekFirst()");
		System.out.println(queue.peekFirst());
		
		// 값만 확인하기 때문에 queue 는 그대로
		System.out.println(queue.toString());
		
		System.out.println();
		
		// isEmpty()
		// Queue 가 비어있는지 확인
		System.out.println("isEmpty()");
		System.out.println(queue.isEmpty());
		
	}

}
