package day10.poly.basic2;

public class House {
	
	// 멤버변수에 Student, Teacher, Employee 가 저장될 수 있으려면
	// 멤버변수 3개 필요
//	private Student[] students = new Student[100];
//	private Teacher[] teachers = new Teacher[100];
//	private Employee[] employees = new Employee[100];
	
	// 하나로 통일
	private Person[] persons = new Person[100];
	private int index = 0;
	
	// 멤버변수에 순서대로 Person 들을 저장하는 메서드	
//	public void checkIn(Student s) {
//	}
//	public void checkIn(Teacher t) {		
//	}
//	public void checkIn(Employee e) {		
//	}
	public void checkIn(Person p) {
//		persons[0] = p;
//		persons[1] = p;
//		persons[2] = p;
		persons[index] = p;
		index++;
	}
	
	// 배열에 저장된 회원의 정보를 출력
	public void confirm() {
		
		for(int i = 0; i < index; i++) {
			System.out.println(persons[i].info());
		}
		
	}
	
 }
