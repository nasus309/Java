
public class ������ǰ {

	private int ����;
	int ����⵵;
	int ������ȿ�����;
	String �귣��;
	String ��;
	Boolean ����;
	
	//������
	public ������ǰ() {} 
	
	public ������ǰ(int year) {
		����⵵ = year;
	}
	
	int get����() {
		return ����;
	}
	
	void set����(int ����) {
		this.���� = ����;
	}
	
	int get����⵵() {
		return ����⵵;
	}
	
	void set����⵵(int year) {
		����⵵ = year;
	}
	
	String get�귣��() {
		return �귣��;
	}
	
	void set�귣��(String �귣��) {
		this.�귣�� = �귣��;
	}
	
	boolean get����() {
		return ����;
	}
	
	void set����(boolean ����) {
		this.���� = ����;
	}
	
	//�޼ҵ�
	public void �Ѵ�() {
		���� = true;
	}
	
	public void ����() {
		���� = false;
	}
	
	public void �޴�����() {
		if(����) {
			System.out.println("�޴��� �����մϴ�.");
		}else {
			System.out.println("������ �����ֽ��ϴ�. �������� ���ּ���.");
		}
	}
}
