package quizObject19;

import java.util.LinkedList;
import java.util.Queue;

public class MakeQueue {
	
	public Queue<Member> queue;
	public static int idx = 0;
	
	public MakeQueue() {
		queue = new LinkedList<>();		
	}
	
	public MakeQueue(Queue<Member> queue) {
		super();
		this.queue = queue;
	}
	
	public void makeQueue() {
		if(queue.size() == 5) {
			idx++;
			System.out.println("========" + idx + "번째 팀 매칭=======");
			while(queue.isEmpty() == false) {
				System.out.println(queue.poll());
			}
		}		
	}
	
	
}
