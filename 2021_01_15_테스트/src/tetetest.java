
public class tetetest {

	

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.money = 1000;
		
		b.buy(new TV()); // 다형성 업캐스팅
		//Product p = new TV();
		b.buy(new Computer());
		b.buy(new TV());
		b.buy(new Audio()); //바구니교체
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
		

	}

	
}
