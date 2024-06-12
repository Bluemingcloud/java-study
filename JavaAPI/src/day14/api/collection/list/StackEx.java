package day14.api.collection.list;

import java.util.Stack;

public class StackEx {
	
	public static void main(String[] args) {
		
		// 모든 Collection 은 동적인 크기를 가진다.
		// 크기를 지정하지 않아도 된다.
		Stack<Integer> stack = new Stack<>();
		
		// push()
		// 스택에 값을 추가
		stack.push(1);
		stack.push(2);
		stack.push(3);	// 마지막에 들어감
		
		// pop()
		// 스택에 값을 삭제
		// 삭제를 하면서 값을 return 한다.
		System.out.println("pop()");
		int s1 = stack.pop();		
		System.out.println(s1);
		
		System.out.println();		
		// toString()
		// 스택의 들어있는 값을 문자열로 확인
		System.out.println("toString()");
		System.out.println(stack.toString());
		
		System.out.println();
		// size()
		// 스택의 크기
		System.out.println("size()");
		System.out.println(stack.size());
		
		System.out.println();
		// peek()
		// 스택에서 값을 얻음
		// 값만 얻어내는 메서드. 값을 삭제 하지는 않는다.
		System.out.println("peek()");
		int b = stack.peek();
		System.out.println(b);
		System.out.println(stack.toString());
		
		System.out.println();
		// isEmpty()
		// 스택이 비어있는지 확인 
		// boolean 타입 반환
		System.out.println("isEmpty()");
		System.out.println(stack.isEmpty());
		
	}
}
