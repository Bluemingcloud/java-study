package day09.modi.construct.pac1;

public class A {
	
	A a = new A(1);		// public (o)
	A a2 = new A(true);	// default (o)
	A a3 = new A("홍");	// private (o)
	
	
	public A(int a) {}
	A(boolean a) {}
	private A(String a) {}	// 외부에서 객체를 생성하지 못하게 할때 private을 붙임
}
