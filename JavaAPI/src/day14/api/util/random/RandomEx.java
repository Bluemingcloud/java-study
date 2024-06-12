package day14.api.util.random;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// 0 ~ 1미만 랜덤 수
		double d = ran.nextDouble();
		System.out.println(d);
		
		// 정수 범위의 랜덤 수
		// Integer.MIN_VALUE 부터 Integer.MAX_VALUE
		int i = ran.nextInt();
		System.out.println(i);
		
		// 0 ~ 값 안의 범위 미만
		// 0 ~ 10 미만의 랜덤 수
		int j = ran.nextInt(10);
		System.out.println(j);
		
	}

}
