package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65 
		
		//아래 값은 몇이 될까요?
		
		System.out.println(y += 10 - x++);				// 13
		System.out.println(x+=2); 						// 5
		System.out.println( !('A' <= c && c <='Z') ); 	// false
		System.out.println('C'-c); 						// 2
		System.out.println(c+1);						// 66
		System.out.println(++c); 						// B
		System.out.println(c++); 						// B -> ++가 뒤에 붙으면 대입 후 연산. 그 전 값이 66 B 였으므로  println 에는 66으로 대입 후 67이 된다.
		System.out.println(c);  						// A -> C가 된다.	
		
	}
}
