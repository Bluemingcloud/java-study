package day08.inherit.good;

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
	}

}
