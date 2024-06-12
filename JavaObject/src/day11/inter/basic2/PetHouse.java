package day11.inter.basic2;

public class PetHouse {

	private Dog dog;
	private Cat cat;
	private GoldFish goldFish;
	
	public PetHouse() {
		dog = new Dog();
		cat = new Cat();
		goldFish = new GoldFish();
	}
	
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public GoldFish getGoldFish() {
		return goldFish;
	}
	public void setGoldFish(GoldFish goldFish) {
		this.goldFish = goldFish;
	}
	
	/*
	 * 1. 메서드 생성 carePet();
	 * 		- 매개변수 : 펫 들의 공통 부모 타입
	 * 		- 기능 : instanceof 사용해서 적합한 펫타입으로 캐스팅
	 * 		- 반환 : x 
	 */
	public void carePet(IPet pet) {
		if(pet instanceof Dog) {
			dog = (Dog)pet;
		} else if(pet instanceof Cat) {
			cat = (Cat)pet;
		} else if(pet instanceof GoldFish) {
			goldFish = (GoldFish)pet;
		}		
	}
	/*
	 * 2. 메서드 생성 petInfo()
	 * 		- 매개변수 : IPet[]
	 * 		- 기능 : 배열 반복
	 * 		- 반환 : x
	 */
	public void petInfo(IPet[] arr) {
		for(IPet pet : arr) {
			pet.playing();
		}
	}

}
