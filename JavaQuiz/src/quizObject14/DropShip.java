package quizObject14;

public class DropShip extends Unit {
	
	public DropShip(int x, int y) {
		super(x, y, 60);
	}
	
	@Override
	public void location() {
		System.out.println("드랍쉽의 x좌표 : " + getX() + ", y좌표 : " + getY());
	}
	
	@Override
	public void move(int x, int y) {
		System.out.println("드랍쉽이 움직입니다.");
		setX(getX() + x);
		setY(getY() + y);
	}
	
	@Override
	public void stop() {
		System.out.println("드랍쉽이 정지했습니다.");
	}
	
	public boolean onBoard() {
		System.out.println("유닛을 수송합니다.");
		return true;
	}
	public boolean getOff() {
		System.out.println("유닛을 내립니다.");
		return false;
	}
}
