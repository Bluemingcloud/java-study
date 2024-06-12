package day04;

public class DoWhileEx {
	public static void main(String[] args) {
		
		// 첫번째는 반드시 실행. 그 후는 while 문과 같음
		int i = 1;
		int sum = 0;
		do {
			
			System.out.println(i);
			sum += i;
			i++;			
		} while (i<=10);
		System.out.println(sum);
	}
}
