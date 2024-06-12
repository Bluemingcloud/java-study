package quizObject14;

public class Tank extends Unit {
	
	private boolean modeFlag;
	
	public Tank(int x, int y) {
		super(x, y, 100);
		modeFlag = false;
	}
	
	public boolean getModeFlag() {
		return modeFlag;
	}
	
	@Override
	public void location() {
		System.out.println("탱크의 x좌표 : " + getX() + ", y좌표 : " + getY());
	}
	
	@Override
	public void move(int x, int y) {
		System.out.println("탱크가 움직입니다.");
		setX(getX() + x);
		setY(getY() + y);
	}
	
	@Override
	public void stop() {
		System.out.println("탱크가 정지했습니다.");
	}
	
	public void changeMode() {
		System.out.println("공격모드 변경");
		modeFlag = modeFlag ? false : true;
	}

}
