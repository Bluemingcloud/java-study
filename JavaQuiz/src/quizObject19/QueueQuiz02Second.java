package quizObject19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueQuiz02Second {
	
	public static void main(String[] args) {
		/*
		롤 큐 만들기
		 */
		String[] tiers = {"브론즈", "실버", "골딱이"};
		Random random = new Random();

		Queue<Member> member = new LinkedList<>();
		for (int i = 0; i < 300; i++) {
			int id = member.hashCode(); // ID는 고유한 해시코드값
			
			String tier = tiers[random.nextInt(tiers.length)];
			member.add(new Member(id, tier));
		}			
		
		///////////////////////////////////////////////////////////
		/////////////////////////여기서 부터 문제/////////////////////
		System.out.println("========현재 게임을 신청한 순서=======");
		System.out.println(member);
		/*
		 * member큐에는 게임을 신청한 순서대로 값이 담기게 됩니다.
		 * 
		 * 게임은 동일한 tier를 가지는 5명씩 한팀을 이루게 됩니다.
		 * 
		 * 예를들어
		 * 실버, 골드, 골드, 골드, 브론즈, 골드, 골드 ... 로 신청되었다면
		 * 골드 5명이 먼저 한팀으로 먼저 소비 되어야 합니다.
		 * 
		 * 실버, 골드, 골드, 골드, 브론즈, 골드, 골드, 실버, 실버, 브론즈, 실버, 실버 ... 로 신청되었다면
		 * 골드 5명 -> 실버 5명이 소비 되어야 합니다
		 * 
		 * 
		 * 랜덤한 member큐 가 주어질 때, 먼저 소비되어야 하는 팀별로 매칭 팀을 출력해주면 됩니다.
		 * 
		 * 
		 */
		
		MakeQueue queueGold = new MakeQueue(new LinkedList<>());
		MakeQueue queueSilver = new MakeQueue(new LinkedList<>());
		MakeQueue queueBronze = new MakeQueue(new LinkedList<>());
		
		while(member.isEmpty() == false) {
			
			String tier = member.peek().getTier();
			
			if(tier.equals("골딱이")) {
				queueGold.queue.offer(member.poll());
			} else if(tier.equals("실버")) {
				queueSilver.queue.offer(member.poll());
			} else {
				queueBronze.queue.offer(member.poll());
			}
			
			queueGold.makeQueue();
			queueSilver.makeQueue();
			queueBronze.makeQueue();
			
		}		
		
		System.out.println("원본 큐 : " + member.toString());
		System.out.println("브론즈 큐 : " + queueBronze.queue.toString());
		System.out.println("실버 큐 : " + queueSilver.queue.toString());
		System.out.println("골드 큐 : " + queueGold.queue.toString());
		
	}	
}