package day15.api.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	
	public static void main(String[] args) {
		
		// 자바에서 기본 Queue는 LinkedList 로 대신해서 사용한다.
		Queue<String> queue = new LinkedList<>();
		
		// Queue 의 삽입
		// add()
		// 뒤에서 추가
		System.out.println("add()");
		queue.add("홍길동");	
		queue.add("김길동");
		
		System.out.println(queue.toString());
		// offer
		// 뒤에서 추가
		System.out.println("offer()");
		queue.offer("이순신");
		queue.offer("홍길자");
		
		System.out.println(queue.toString());
		System.out.println();
		
		// Queue 의 삭제
		// poll()
		// 값을 반환하고, 큐에서 삭제
		// 처음에 추가했던 값이 먼저 나온다. FIFO
		System.out.println("poll()");
		String n = queue.poll();
		
		System.out.println(n);
		System.out.println(queue.toString());
		System.out.println();
		
		// Queue 의 값 확인
		// peek()
		// 다음 값을 반환하고, 삭제는 하지 않음
		System.out.println("peek()");
		String n2 = queue.peek();
		
		System.out.println(n2);
		System.out.println(queue.toString());
		System.out.println();
		
		System.out.println("------------------------------------------");
		
		// LinkedList 를 LinkedList 타입에 저장하면, 
		// List 기능과 Queue 기능을 둘 다 쓸 수 있다.
		LinkedList<String> list = new LinkedList<String>();
		
		// 추가
		list.add("a");
		
		list.offer("b");
		list.offer("c");
		
		list.addFirst("앞에서 추가");
		list.addLast("뒤에서 추가");
		
		// 삭제
		System.out.println(list.poll());		// 앞에서 삭제
		
		System.out.println(list.remove(0));		// 0 번째 인덱스 삭제
		
		System.out.println(list.toString());
		
		// 값 얻기
		System.out.println(list.peek());
		System.out.println(list.get(0));
		
	}

}
