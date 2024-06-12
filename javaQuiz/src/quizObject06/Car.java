package quizObject06;

public class Car {
	
	String model;
	int speed;
	
	Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	Car(String model) {
		this(model, 0);
	}
	
	void info() {
		System.out.println("차량 모델 : " + model + ", 속도 : " + speed);
	}
	
	void accel(int speed) {
		/*
		 * 멤버변수 speed 가 150 이상이라면 "속도를 올릴 수 없습니다." 출력
		 * 그렇지 않으면 매개변수를 멤버변수에 저장
		 */
		if(this.speed >= 150) {
			System.out.println("속도를 올릴 수 없습니다.");
			return;
		} else {
			this.speed = speed;
		}
	}
	
	void run() {
		/*
		 * 0 ~ 200 까지 30 씩 증가하는 for 문을 생성하고,
		 * for 문 안에서 accel()을 호출하세요
		 * 멤버변수 speed도 출력하세요
		 */
		for(int i = 0; i <= 200; i += 30) {
			if(i == 0 && speed != 0) {
				i = speed;
			}
			this.accel(i);
			System.out.println(this.speed);
		}
	}
}
