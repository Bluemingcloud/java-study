package quizObject20;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1 ~ 45 까지 중복되지 않는 로또 번호 6개 만들기
		 * 
		 * 1. 랜덤객체를 사용해서 1 ~ 45 까지 랜덤수를 생성
		 * 2. List or Set 을 사용해서 랜덤한 로또번호 6개를 만들면됩니다.
		 */
		
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size() <= 6) {
			Random n = new Random();
			int num = n.nextInt(45) + 1;
			lotto.add(num);
		}
		
		System.out.println(lotto.toString());		
	}
}
