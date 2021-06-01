
public class Buyer{
	
	int money =1000;
	Product cart[] = new Product[3];
	//Product 타입의 배열 선언, index : 0~2
	int i=0;
	
	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
			
			return;//왜함?
		}
		money = money - p.price;
		
		add(p);
	}
	
	void add(Product p) {
		if(i>=cart.length) {
			System.out.println("장바구니 크기가 부족하여 큰 바구니로 교체합니다.");
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart,0,tmp,0,cart.length); 
			//카피할ㄹ대상,카피할대상 0번지부터,카피받을대상,카피받을 대상 0번지부터,
			//cart[0],cart[1],cart[2]
			//tmp[0],tmp[1],tmp[2]...tmp[5]
			
			cart = tmp; //cart 배열을 6짜리로 바꾼다...
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
		
		System.out.println("구입한 물건 : "+itemList);
		System.out.println("사용한 금액 : "+sum);
		System.out.println("남은 금액 : "+money);
		
	
	}

}
