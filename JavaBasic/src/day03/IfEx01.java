package day03;

public class IfEx01 {
	
	public static void main(String[] args) {
		
		// 0 ~ 100 범위의 랜덤한 정수 생성
		int point = (int)(Math.random()*101);
		
		System.out.println("랜덤한 정수 : " + point );
		
		String grade;		
		if(point >= 60) {
			System.out.println("합격 입니다.");		
			grade = "P";
//			String grade = "P";
		} else {
			System.out.println("불합격 입니다.");
			grade = "F";
//			String grade = "F";	// 변수는 해당 범위에서만 사용가능
		}
		System.out.println("당신의 등급은 : " + grade + " 입니다.");
		
		// if 구문을 여럿 사용해서 적절한 조건에 탈출해 주는게 좋은 코드이다.
//		if(point < 60) {
//			System.out.println("불합격 입니다.");
//		}
		
	}
}
