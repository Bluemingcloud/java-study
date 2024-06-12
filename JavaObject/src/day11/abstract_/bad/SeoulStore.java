package day11.abstract_.bad;

public class SeoulStore extends Store {
	// 만약 abstract 클래스가 없다면?
	public void melon() {
		System.out.println("서울지점 멜론은 500원");
	}
	// 나머지 메서드는 오버라이딩을 못했다면?
}
