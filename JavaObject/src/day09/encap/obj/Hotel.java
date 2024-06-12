package day09.encap.obj;

public class Hotel {
	
	// 호텔이 쉐프를 필요로 한다면?
	private Chef chef;
	
	// 호텔이 생성될 때, 쉐프를 초기화
//	public Hotel() {
//		this.chef = new Chef();
//	}	
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	// getter / setter
	// setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	//getter
	public Chef getChef() {
		return chef;
	}

}
