package first;

public class BusExam {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.run(); // ����Ŭ�������� �ƹ��͵� ������ Car Ŭ������ ��� �޾Ƽ� run()�޼ҵ� ��밡��.
		bus.ppangppang(); //Ȯ���Ͽ���...?(�θ�޼ҵ帻�� �ٸ� �޼ҵ�)
		
		Car car = new Car();
		car.run();
		//car.ppangppang(); �θ�Ŭ������ �ڽ� Ŭ���� �޼ҵ� ��� ����.
	}

}
