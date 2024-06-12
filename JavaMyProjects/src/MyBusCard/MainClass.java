package MyBusCard;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account acc1 = new Account("1234", sc);
		acc1.depositMoney(100000);
		System.out.println(acc1.getBalance());
		
		Card kpass = new KPassCard(acc1);
		Card climate = new ClimateCard(acc1);
		Bus.boardBus(kpass);
		Bus.getOffBus(climate);
		Bus.getOffBus(kpass);
		Bus.boardBus(kpass);
		Bus.boardBus(kpass);
		Bus.boardBus(climate);
		Bus.getOffBus(kpass);
		kpass.doPay();
		kpass.doPayBack();
		climate.doPay();
		System.out.println(acc1.getBalance());
		
		Bus.boardBus(climate);
		Bus.getOffBus(climate);

		System.out.println(acc1.getBalance());
		
		acc1.resetPassword();
		
		
		
	}

}
