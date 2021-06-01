package first;

public class TruckExam {

	public static void main(String[] args) {
		
		// 객체가 생성이 될 때 반드시 생성자를 실행하고 생성이 됨.
		// truck이 인스턴스화 될 때 부모 car 객체가 먼저 인스턴스화 됨.(먼저 메모리에 올라감)
		// 생성자가 호출 될 때 자동으로 부모생성자가 호출 되면서 초기화시킴. 
		Truck truck = new Truck(); 
		
		
		Car c = new Car();
	}

}
