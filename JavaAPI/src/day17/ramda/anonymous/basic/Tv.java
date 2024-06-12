package day17.ramda.anonymous.basic;

public class Tv {
	
	private int volume;
	private RemoteControl remote;
	
	// 생성될 때, 리모컨 객체를 갖는다(익명객체)
	public Tv() {
		remote = new RemoteControl() {
			// 안에서 바깥을 참조할 수 있음
			@Override
			public void volumeUp() {
				volume++;
				System.out.println("볼륨 : " + volume);
			}
			
			@Override
			public void volumeDown() {
				volume--;
				System.out.println("볼륨 : " + volume);
			}
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}
		};
	}
	
	public RemoteControl getRemote() {
		return remote;
	}
	
	
}
