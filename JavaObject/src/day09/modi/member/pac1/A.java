package day09.modi.member.pac1;

import java.util.Arrays;

public class A {
	
	public int var1;
	int var2;
	private int var3;
	
	public void method01() {}
	void method02() {}
	private void method03() {}
	
	
	// 생성자
	public A() {
		
		var1 = 1;
		var2 = 2;
		var3 = 3;
		method01();
		method02();
		method03();
	}
	
	// protected
	// 같은 패키지 안에서만 접근이 가능
	// 단, 패키지가 다르더라도, super 키워드를 통해서 접근이 가능.
	protected int var;
	protected A(int i) {
		
	}
	protected void method() {
		
	}
	
}
