package day04;

public class WhileEx02 {

	public static void main(String[] args) {

		//어떤수 x까지의 짝수들의 합
		//10
		//2 + 4 + 6 + 8 + 10
		
		int i = 1;
		int sum = 0; //누적할 변수
		
		while(i <= 10) {
			//i가 짝수인가 아닌가 확인해서, 누적
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println("10까지 짝수의 합: " + sum);
	}
}
