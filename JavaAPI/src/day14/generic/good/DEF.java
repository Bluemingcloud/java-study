package day14.generic.good;

public class DEF<T, C> {	// 멀티 제네릭
	
	// t = 키, C = 값
	private T key;
	private C value;
	
	public void put(T key, C value) {
		this.key = key;
		this.value = value;
	}
	
	public C get(T key) {
		return value;
	}
	

}
