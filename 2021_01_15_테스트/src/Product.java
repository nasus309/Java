
public class Product {

	int price;//力前狼 啊拜
	
	Product(int price) { //积己磊
		this.price = price;
	}
	
}

class TV extends Product{
	TV(){
		super(100);
	}
	
	public String toString() {
		return "tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	Audio(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}