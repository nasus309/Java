
public class Buyer1 {
	
	private int money;
	private String cart[] = {};
	private int pay;
	
	void buy(int pay) {
		System.out.println("총 금액은 " + pay +"원 입니다.");
	}
	
	void add(String pdt) {
		
		for(int i=0;i<=cart.length;i++) {
			cart = new String[i+1];
			cart[i] = pdt;
		}
		System.out.println(cart);
		//System.out.println(pdt + "구입 가격은 " +  price + "원 입니다.");
	}
	
	void summary() {
		money = money - pay;
		System.out.println("구입한 물건은 " + cart + "이며 남은 금액은 " + money + "원 입니다.");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
