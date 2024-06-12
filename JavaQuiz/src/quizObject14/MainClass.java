package quizObject14;

public class MainClass {
	
	public static void main(String[] args) {
		
		Unit m1 = new Marine(0, 0);
		Unit m2 = new Marine(0, 0);
		Tank t1 = new Tank(0, 0);
		Unit d1 = new DropShip(0, 0);
		
		m1.move(5, 5);
		m1.stop();
		m1.location();
		m1.move(3, 3);
		m1.stop();
		m1.location();
		System.out.println();
		m2.move(2, 3);
		m2.stop();
		m2.location();
		
		System.out.println("-------------------------------------------");
		Marine mm1 = (Marine)m1;
		Marine mm2 = (Marine)m2;
		
		System.out.println("마린1 의 공격력 : " + mm1.getAttack());
		System.out.println("마린1 의 방어력 : " + mm1.getArmor());
		
		System.out.println("마린2 의 공격력 : " + mm2.getAttack());
		System.out.println("마린2 의 방어력 : " + mm2.getArmor());
		
		System.out.println();
		
		mm1.upgradeAttack();
		System.out.println("마린1의 공격력 업그레이드");
		mm2.upgradeArmor();
		System.out.println("마린2의 방어력 업그레이드");
		
		System.out.println();
		
		System.out.println("마린1 의 공격력 : " + mm1.getAttack());
		System.out.println("마린1 의 방어력 : " + mm1.getArmor());
		
		System.out.println("마린2 의 공격력 : " + mm2.getAttack());
		System.out.println("마린2 의 방어력 : " + mm2.getArmor());
		
		System.out.println("-------------------------------------------");

		t1.move(5, 10);
		t1.stop();
		t1.location();
		t1.changeMode();
		
		System.out.println("-------------------------------------------");
		
		d1.move(2, 2);
		d1.stop();
		d1.location();		
		
	}
}
