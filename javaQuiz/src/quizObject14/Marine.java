package quizObject14;

public class Marine extends Unit {
	private static int attack = 6;
	private static int armor = 0;
	
	public Marine(int x, int y) {
		super(x, y, 60);	
	}	
	
	@Override
	public void location() {
		System.out.println("마린의 x좌표 : " + getX() + ", y좌표 : " + getY());
	}
	
	@Override
	public void move(int x, int y) {
		System.out.println("마린이 움직입니다.");
		setX(getX() + x);
		setY(getY() + y);
	}
	
	@Override
	public void stop() {
		System.out.println("마린이 정지했습니다.");
	}	
	
	public int getAttack() {
		return attack;
	}
	public int getArmor() {
		return armor;
	}
	
	public void upgradeAttack() {
		attack++;
	}
	public void upgradeArmor() {
		armor++;
	}
}
