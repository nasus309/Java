
public class Ʈ�� extends �ڵ��� {

	int ���緮;
	String ����;
	
	Ʈ��(){ //1. ����Ŭ���� ������ ȣ����ġ���� skip
		//4. ����Ŭ���� ������� ����
		System.out.println("����(Ʈ��)Ŭ���������� ����");
	}
	
	Ʈ��(String s){
		super(s); //default ���� ���ϰ�...���ڿ� s��...������ ȣ���ϴ� �����ڸ� ȣ���ش޶�... �������ϸ� default Ÿ�� ȣ��...
		System.out.println("���� ���ڿ��� ����ϴ� �������Դϴ�.");
	}
	
	@Override
	void ����() {
		System.out.println("Ʈ���� �ӵ��� ���� ��ŵ�ϴ�.");
	}
	
	
	void ���緮�˾ƺ���() {
		
	}
	
	//����,�������� ����
	void ���󺯰�(String s) {
		this.���� = s;
	}
}
