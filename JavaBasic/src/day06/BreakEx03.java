package day06;

public class BreakEx03 {
	public static void main(String[] args) {
		
		// 중첩 반복에서 break
		// 전체 반복을 탈출하고 싶을때
		// 1. 탈출을 위한 변수를 활용 (플래그 변수)
		
		boolean bool = false;
		
		for(char c = 'A';  c <= 'Z'; c++) {
			
			for(char l = 'a'; l <= 'z'; l++) {
				System.out.println(c + "-" + l);
				
			    if(l == 'e') {
				    bool = true;
				    break;
			    }				
            }
			
            if(bool) {
				break;
            }			
		}
		
		// 2. 이름 붙이기 (라벨 방식)
		// 중첩 반복문에서 바깥 반복문을 완전히 탈출하려면
		// 탈출할 반복문에 이름을 붙여준다.
		// 라벨:for(조건문) {
		//			for(조건문){
		//				break 라벨;
		
		ex:for(char  c = 'A'; c<='Z'; c++) {
			
			for(char l = 'a'; l <='z'; l++) {
				
				System.out.println(c + "-" + l);
				
				if(l == 'e') {
					break ex; // 탈출할 이름
				}
			}
		}
	}
}
