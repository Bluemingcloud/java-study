package day07;

public class MethodTest {
	
	public static void main(String[] args) {
		
		System.out.println(calcNum(12,34,"+"));
		System.out.println(calcNum(12,34,"-"));
		System.out.println(calcNum(12,34,"*"));
		System.out.println(calcNum(12,34,"/"));	
		System.out.println(calcNum(12,34,"%"));
		
	}
	static String calcNum(int a, int b, String str) {
		String result = "";
		switch (str) {
		case "+" : 
			result += a + b;
			break;
		
		case "-" : 
			result += a - b;
			break;
			
		case "*" : 
			result += a * b;
			break;
			
		case "/" : 
			result += (double)a / b;
			break;
		default : 
			result = "잘못된 입력입니다.";
			break;
		}
		return result;		
	}

}
