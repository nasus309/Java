package first;

public class Car {
	
	public void run() {
		System.out.println("�޸���.");
	}

	
	//Ÿ�� �ʵ��
	String name;
	int number;
	
	//�����ڸ� ����� ������ ���µ�? �����Ϸ��� �⺻ �����ڸ� �����?
	//�ļ��ڰ� �ϴ����� ��ü�� �� �� �ʵ带 �ʱ�ȭ�� �����ϴ°�...
	
	
	
	//������ ������ ���� �˾� ���� ���� ���������� �����ؾ���
	/*�ؿ� ������ ����
	  public Car(String n) {
		name = n;
	} �̾����� n�� name���� �ٲ��ָ鼭 ������ ���� this�� ���ذ��̴�~*/
	
	//this �� ��ü �ڽ��� �����ϴ� Ű����(�ڽ��� �ٷ� ���� �ȵǴµ�)
	public Car(String name) {
		this.name = name;
	}
	
	
	//�⺻������ ����
	public Car() {
//		this.name = "�̸�����";
//		this.number = 0;
		this("�̸�����",0); //�ٷ� �ؿ� ������ ȣ��!(Ÿ�Կ� �˸´� ������ ȣ��)
		System.out.println("Car�� �⺻�������Դϴ�.");
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	


}
