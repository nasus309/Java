
public class �ڵ��� {
	int ����; 
	double ����;
	String ����;
	String ������;
	String ����;
	String ��;
	private int price; //information hide...? ���� ����
	int �ӵ�;
	
	String get����() { // ���α׷��� ���̿��� get�� �տ� �پ������� �ʵ忡 �����ؼ� �����͸� �о���� ������ ����.(getXXX())
		return ����;
	}
	
	public void setPrice(int ����) { // ���α׷��� ���̿��� set�� �տ� �پ������� �ʵ忡 �����ؼ� �����͸� ���� ������ ����.(setXXX())
		//price�� private ������ ����.price ������ �ʵ忡 ���� ���� �Ұ����ε�
		//�޼ҵ带 ���ؼ��� ���� �����ϰ� ���ش�! (����.setPrice();)
		this.price = ����;
	}
	
	int getPrice() { 
		return price;
	}
	
	
	String get������() {
		return ������;
	}
	
	public void set������(String ������) {
		this.������ = ������;
	}
	
	int get�ӵ�() {
		return �ӵ�;
	}
	
	public void set�ӵ�(int �ӵ�) {
		this.�ӵ� = �ӵ�;
	}
	
	void set����(String ����) {
		this.���� = ����;
	}
	
	String get����() {
		return ����;
	}
	
	void set��(String ��) {
		this.�� = ��;
	}
	
	String get��() {
		return ��;
	}
	
	public void ����() {
		�ӵ� = �ӵ� + 10;
	}
	
	public void ����(int value) {
		�ӵ� = �ӵ� + value;
	}
	
	
	public void ����() {
		if(�ӵ�<=0) {
			�ӵ� = 0;
		}else {
			�ӵ� = �ӵ� - 10;
		}
	}
	
	public void �׺���̼��ѱ�() {
		
	}
		
}
