package day09.modi.member.pac2;

import day09.modi.member.pac1.A;

public class D extends A{
	public D() {
		// A가 가지고 있는 default 변수는 다른패키지에서 보이지 않는다. (접근 불가)
//		super.var2 = 1;	// default (x)
		
		// protected 는 상속 관계인 경우 super를 이용해 접근 가능
		super.var = 1;	// protected (o)		
		
	}
}
