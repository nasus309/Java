package first;

public class BusExam {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.run(); // 버스클래스에는 아무것도 없지만 Car 클래스를 상속 받아서 run()메소드 사용가능.
		bus.ppangppang(); //확장하였다...?(부모메소드말고 다른 메소드)
		
		Car car = new Car();
		car.run();
		//car.ppangppang(); 부모클래스는 자식 클래스 메소드 사용 못함.
	}

}
