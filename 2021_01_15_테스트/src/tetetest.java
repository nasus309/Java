
public class tetetest {

	

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.money = 1000;
		
		b.buy(new TV()); // ������ ��ĳ����
		//Product p = new TV();
		b.buy(new Computer());
		b.buy(new TV());
		b.buy(new Audio()); //�ٱ��ϱ�ü
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
		

	}

	
}
