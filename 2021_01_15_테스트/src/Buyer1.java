
public class Buyer1 {
	
	private int money;
	private String cart[] = {};
	private int pay;
	
	void buy(int pay) {
		System.out.println("�� �ݾ��� " + pay +"�� �Դϴ�.");
	}
	
	void add(String pdt) {
		
		for(int i=0;i<=cart.length;i++) {
			cart = new String[i+1];
			cart[i] = pdt;
		}
		System.out.println(cart);
		//System.out.println(pdt + "���� ������ " +  price + "�� �Դϴ�.");
	}
	
	void summary() {
		money = money - pay;
		System.out.println("������ ������ " + cart + "�̸� ���� �ݾ��� " + money + "�� �Դϴ�.");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
