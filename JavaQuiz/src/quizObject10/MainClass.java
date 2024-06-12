package quizObject10;

public class MainClass {
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	public static void main(String[] args) {
		
		Computer com = new Computer();
		
		com.computerInfo();
		
		com.getMonitor().info();		
	}
}
