
public class Ŀ�� {
	private String ������; //�ν��Ͻ�����
	private String ����; //�ν��Ͻ�����
	private int ����; //�ν��Ͻ�����
	private static int �Ǹż���; //Ŭ��������(static����), �ν��Ͻ��� ������ �ƴϰ� Ŭ������ ������ �Ǵ°���~
	
	//�޼ҵ� �����ε�
	public Ŀ��() {}
	public Ŀ��(String s) {
		������ = s;
	}
	public Ŀ��(String s,String ss) {
		//���� �޼ҵ�� �������ֱ����� String ss�� �Ķ���ͷ� �������� �����δ� �Ⱦ�.
	}
	
	//static �޼ҵ� -> �ν��Ͻ������� ȣ�� �Ұ���.Ŭ���������θ� ȣ�� ����...?
	static void Ŀ�Ǽ���() {
		System.out.println("���� ��� �ľ� �ȵ���.");
	}
	
	
	public void ������() {
		System.out.println("Ŀ�ǰ� �������ϴ�.");
	}
	public void ���´�() {
		System.out.println("���θ� �����ϴ�.");
	}
	
	public void set������(String ������) {
		this.������ = ������;
	}
	String get������() {
		return ������;
	}
	
	public void set����(String ����) {
		this.���� = ����;
	}
	
	public String get����() {
		return ����;
	}
	
	public void get����(int ����) {
		this.���� = ����;
	}
	
	public int get�Ǹż���() {
		return �Ǹż���;
	}
	
	public void get�Ǹż���(int �Ǹż���) {
		this.�Ǹż��� = �Ǹż���;
	}
}
