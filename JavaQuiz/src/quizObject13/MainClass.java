package quizObject13;

public class MainClass {
	
	public static void main(String[] args) {
		
		Shape rect = new Rect("사각형", 10);
		Shape circle = new Circle("원", 5);
		
		System.out.println(rect.getName() + ", 넓이 : " + rect.getArea());
		System.out.println(circle.getName() + ", 넓이 : " + circle.getArea());
		
	}

}
