
public class Product {

	int price;//��ǰ�� ����
	
	Product(int price) { //������
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