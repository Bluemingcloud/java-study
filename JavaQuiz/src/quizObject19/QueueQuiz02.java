package quizObject19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueQuiz02 {
	
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
		
		Queue<Member> goldTier = new LinkedList<>();
		Queue<Member> silverTier = new LinkedList<>();
		Queue<Member> bronzeTier = new LinkedList<>();
		
		int i = 1;
		while(member.isEmpty() == false) {
			String tier = member.peek().getTier();
			if(tier.equals("골딱이")) {
				goldTier.offer(member.poll());
			} else if(tier.equals("실버")) {
				silverTier.offer(member.poll());
			} else {
				bronzeTier.offer(member.poll());
			} 
			
			if(goldTier.size() == 5) {
				System.out.println("========" + i + "번째 팀 매칭=======");
				while(goldTier.isEmpty() == false) {
					System.out.println(goldTier.poll());
				}
				i++;
			} else if(silverTier.size() == 5) {
				System.out.println("========" + i + "번째 팀 매칭=======");
				while(silverTier.isEmpty() == false) {
					System.out.println(silverTier.poll());
				}
				i++;
			} else if(bronzeTier.size() == 5) {
				System.out.println("========" + i + "번째 팀 매칭=======");
				while(bronzeTier.isEmpty() == false) {
					System.out.println(bronzeTier.poll());
				}
				i++;
			}	
			
		}
		
		System.out.println("원본 큐 : " + member.toString());
		System.out.println("브론즈 큐 : " + bronzeTier.toString());
		System.out.println("실버 큐 : " + silverTier.toString());
		System.out.println("골드 큐 : " + goldTier.toString());
		
	}	
}