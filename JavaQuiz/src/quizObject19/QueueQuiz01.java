package quizObject19;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueQuiz01 {
	
	public static void main(String[] args) {
		
		Customer[] arr = {
				new Customer("hong", 5),
				new Customer("lee", 4),
				new Customer("john", 1),
				new Customer("홍길동씨", 6),
				new Customer("alen", 2)
		};
		
		// 은행에 번호표를 뽑아서 가지고 있는 랜덤한 Customer 배열 입니다.
		// 번호표 순서대로 객체를 출력.
		
		Queue<Customer> queue = new PriorityQueue<>();
		
		for(Customer c : arr) {
			queue.offer(c);
		}
		
		// Arrays.asList(arr) 로 배열 -> 컬렉션 형변환
		// addAll(컬렉션 객체) 컬렉션 모두를 add
		// queue.addAll(Arrays.asList(arr));
		
		// 큐를 소비
		while(queue.isEmpty() == false) {
			System.out.println(queue.poll());
		}
		
	}

}
