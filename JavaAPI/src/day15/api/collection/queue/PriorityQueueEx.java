package day15.api.collection.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	
	public static void main(String[] args) {
		
		// 우선순위 큐
		// 자동 정렬기능을 가진다.
//		PriorityQueue<Integer> queue = new PriorityQueue<>();
		Queue<Integer> queue1 = new PriorityQueue<>();
		Queue<Integer> queue2 = new LinkedList<>();
		
		queue1.offer(5);
		queue1.offer(2);
		queue1.offer(3);
		queue1.offer(4);
		queue1.offer(10);
		queue1.offer(6);
		
		queue2.offer(5);
		queue2.offer(2);
		queue2.offer(3);
		queue2.offer(4);
		queue2.offer(10);
		queue2.offer(6);
		
		// 보이는 것과 다르게 저장 되어 있다. (정렬되어 저장)
		System.out.println(queue1.toString());
		System.out.println(queue2.toString());
		
		System.out.println(queue1.poll());	// 2
		System.out.println(queue1.poll());	// 3
		System.out.println(queue1.poll());	// 4
		
		System.out.println(queue2.poll());	// 5
		System.out.println(queue2.poll());	// 2
		System.out.println(queue2.poll());	// 3
		
		// 비어있는지 확인
		if( queue1.isEmpty() == false) {
			System.out.println("큐가 비어있지 않음");
		}
		
		System.out.println("------------------------------------");
		
		// UserVO를 담을 수 있는 Queue
		// 큐가 순서를 확인할 때 compareTo 메서드를 확인한다.
		// 객체를 우선순위큐에 저장할 때는 compareTo에 정의된 형식에 따라서
		// 우선순위방법을 지정해줘야한다.
		// comparable 인터페이스 를 구현해서 compareTo 메서드를 오버라이딩.
		Queue<UserVO> queue = new PriorityQueue<>();
		
		queue.offer(new UserVO("홍길동", 20));
		queue.offer(new UserVO("이순신", 30));
		queue.offer(new UserVO("홍길자", 40));
		queue.offer(new UserVO("신사임당", 50));
		queue.offer(new UserVO("홍길동", 50));
		
		while(queue.isEmpty() == false) {
			System.out.println(queue.poll());
		}
		
	}

}
