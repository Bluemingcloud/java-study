package quizObject11;

public class MyCart {
	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	private int money;
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0;
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart(int money) {
		this.money = money;
	}
	
	/* 
	 * 3. buy(모든 상품을 받도록 선언)
	 * 접근제어자 퍼블릭
	 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고
	 * add(상품)을 호출해 줍니다.
     */ 	
	public void buy(Product p) {
		if(this.money < p.price) {
			System.out.println("금액부족");
			return;
		}
		this.money -= p.price;
		this.add(p);
	}
	
	/* 
	 * 4. add(모든 상품을 받도록 선언)
	 * 접근제어자 프라이빗
	 *
	 * 만약 i의 값이 장바구니의 크기보다 같거나 크다면
	 * 기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 * 기존의 장바구니 값을 새로운 배열에 복사.
	 * 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * 상품을 장바구니에 담는다.
	 * 
	 */
	private void add(Product p) {
		if(this.i >= this.cart.length) {
			Product[] temp = new Product[this.cart.length * 2];
			for(int j = 0; j < this.cart.length; j++) {
				temp[j] = this.cart[j];
			}
			this.cart = temp;	// 멤버변수를 temp로 변경
			temp = null;		// temp 삭제
		}
		//cart = Arrays.copyOf(cart, cart.length * 2);
		
//		this.cart[this.cart.length - 1] = p;
		this.cart[this.i] = p;
		this.i++;
	}

	/*
	 * 5.info()
	 * 
	 * instanceof 를 적용해보면 좋을것 같아요
	 *
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 * 남은금액 출력
	 * 메인에서 buy메서드 실행 
	 * 
	 */
	public void info() {
		int totalPrice = 0;
		String carts = "";
		// cart.length 만큼 돌리면 null 에러가 나타난다.
		/* this.i 만큼 돌리기
		 * for(int j = 0; j < this.i; j++)
		 */
		for(Product p : cart) {
			if(p instanceof Radio) {
				Radio r = (Radio)p;
				carts += r.name + " ";
				totalPrice += r.price;
			} else if(p instanceof Computer) {
				Computer c = (Computer)p;
				carts += c.name + " ";				
				totalPrice += c.price;
			} else if(p instanceof Tv) {
				Tv t = (Tv)p;
				carts += t.name + " ";
				totalPrice += t.price;
			}
		}
		System.out.println("구매물품 목록 : " + carts);
		System.out.println("총 금액 : " + totalPrice);
		System.out.println("남은 금액 : " + this.money);		
	}	
}
