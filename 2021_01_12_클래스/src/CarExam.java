class Car{
	String color;
	int speed;
	private String model;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}
	
	String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	String getColor() {
		return color;
	}
	
	int getSpeed() {
		return speed;
	}
}

public class CarExam {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.color = "����";
		myCar1.speed = 0;
		//myCar1.model = "SS203"; => ���� ��
		myCar1.setModel("SS203");
		System.out.println("�ڵ��� 1�� ���� " + myCar1.getModel());
		
		Car myCar2 = new Car();
		myCar2.color = "�Ķ�";
		myCar2.speed = 0;
		
		Car myCar3 = new Car();
		myCar3.color = "���";
		myCar3.speed = 0;
		
		myCar1.upSpeed(30);
		System.out.println("�ڵ���1�� ������ "+myCar1.color + "�̸�, ����ӵ��� "+myCar1.speed+"km �Դϴ�.");
		System.out.println("�ڵ���1�� ������ "+myCar1.getColor() + "�̸�, ����ӵ��� "+myCar1.getSpeed()+"km �Դϴ�.");
		
		
		myCar2.upSpeed(60);
		System.out.println("�ڵ���2�� ������ "+myCar2.color + "�̸�, ����ӵ��� "+myCar2.speed+"km �Դϴ�.");
		System.out.println("�ڵ���2�� ������ "+myCar2.getColor() + "�̸�, ����ӵ��� "+myCar2.getSpeed()+"km �Դϴ�.");
		
		myCar3.upSpeed(0);
		System.out.println("�ڵ���3�� ������ "+myCar3.color + "�̸�, ����ӵ��� "+myCar3.speed+"km �Դϴ�.");
		System.out.println("�ڵ���3�� ������ "+myCar3.getColor() + "�̸�, ����ӵ��� "+myCar3.getSpeed()+"km �Դϴ�.");
		
		
		
	}

}
