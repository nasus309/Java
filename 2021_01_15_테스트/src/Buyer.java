
public class Buyer{
	
	int money =1000;
	Product cart[] = new Product[3];
	//Product Ÿ���� �迭 ����, index : 0~2
	int i=0;
	
	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� " + p + "��/�� �� �� �����ϴ�.");
			
			return;//����?
		}
		money = money - p.price;
		
		add(p);
	}
	
	void add(Product p) {
		if(i>=cart.length) {
			System.out.println("��ٱ��� ũ�Ⱑ �����Ͽ� ū �ٱ��Ϸ� ��ü�մϴ�.");
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart,0,tmp,0,cart.length); 
			//ī���Ҥ����,ī���Ҵ�� 0��������,ī�ǹ������,ī�ǹ��� ��� 0��������,
			//cart[0],cart[1],cart[2]
			//tmp[0],tmp[1],tmp[2]...tmp[5]
			
			cart = tmp; //cart �迭�� 6¥���� �ٲ۴�...
		}
		cart[i++] = p; //0.... 
	}
	
	void summary() {
		String itemList ="";
		int sum = 0;
		for (int i=0;i<cart.length;i++) {
			if(cart[i]==null)
				break;
			itemList += cart[i] + ",";
			sum+=cart[i].price;
			
//			if(cart.length-1?)
//				itemList = itemList + ",";
			
		}
		
		System.out.println("������ ���� : "+itemList);
		System.out.println("����� �ݾ� : "+sum);
		System.out.println("���� �ݾ� : "+money);
		
	
	}

}
