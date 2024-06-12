package day11.inter.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		// Dog 는 세가지 타입이 될 수 있다.
		Animal a = new Dog();
		a.eating();
//		a.playing();	// Animal의 기능만 사용가능
		
		IPet i = new Dog();
//		i.eating();
		i.playing();	// IPet의 기능만 사용가능
		
		Dog d = new Dog();
		d.eating();
		d.playing();	// Animal 과 IPet의 기능 모두 사용 가능
		
		// 인터페이스도 다형성과 같이 사용 가능
		// IPet 은 세가지 타입을 담을 수 있다.
		IPet pet1 = new Dog();
		IPet pet2 = new Cat();
		IPet pet3 = new GoldFish();
		
		pet1.playing();
//		pet1.eating();
		pet2.playing();
//		pet1.eating();
		pet3.playing();
//		pet3.swimming();
		
		System.out.println("-------------------------------");
		
		// 클래스의 다형성
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] arr = {dog, cat, tiger};
		
		for(Animal animal : arr) {
			animal.eating();
		}
		
		System.out.println("-------------------------------");
		
		// IPet 배열을 생성
		// IPet 에 들어갈 수 있는 타입은 Dog, Cat, GoldFish
		IPet[] arr2 = new IPet[3];
		
		arr2[0] = (IPet)dog;	// Animal 과 IPet 은 서로 관계가 없지만
		arr2[1] = (IPet)cat;	// dog, cat 이 상호 연관성이 있으면 형변환 가능
		// arr2[2] = (IPet)tiger;	// 런타임 에러 
		arr2[2] = new GoldFish();// GoldFish 가 IPet 으로 자동 형변환
		
		for(IPet pet : arr2) {
			pet.playing();
		}
		
		System.out.println("-------------------------------");
		
		PetHouse petHouse = new PetHouse();
		petHouse.petInfo(arr2);	
		
		petHouse.carePet(pet1);
		Dog dog1 = petHouse.getDog();
		dog1.eating();
		dog1.playing();
		
		petHouse.carePet(pet2);
		Cat cat1 = petHouse.getCat();
		cat1.playing();
		cat1.eating();
		
		petHouse.carePet(pet3);
		GoldFish goldFish1 = petHouse.getGoldFish();
		goldFish1.swimming();
		goldFish1.playing();
		

	}

}
