package day08.overriding.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.age = 20;
		p.name = "홍길동";
		System.out.println(p.info());
		
		
		Student s = new Student();
		s.age = 20;
		s.name = "홍길자";
		s.studentId = "123123";
		System.out.println(s.info());
		
		Employee e = new Employee();
		e.age = 30;
		e.name = "신사임당";
		e.department = "미술부";
		System.out.println(e.info());
		
		Teacher t = new Teacher();
		t.age = 40;
		t.name = "이순신";
		t.subject = "체육";
		System.out.println(t.info());
	}

}
