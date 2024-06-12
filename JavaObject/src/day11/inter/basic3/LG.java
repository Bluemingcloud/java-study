package day11.inter.basic3;

public class LG implements Printed {

	// LG 프린터기에 맞춰서 실행될 수 있도록 내용물을 구현
	
	public final static String LOGO = "Life is Good";
	
	@Override
	public void print(String document) {
		System.out.println(LOGO);
		System.out.println("문서출력 : " + document);
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println(LOGO);
		System.out.println("문서출력 : " + document + ", 색상 : " + color);		
	}

	@Override
	public int copy(int cnt) {
		System.out.println(LOGO);
		System.out.println("문서복사 : " + cnt);
		return cnt;
	}

}
