
public class Product {

	int price;//제품의 가격
	
	Product(int price) { //생성자
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