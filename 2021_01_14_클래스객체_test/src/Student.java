

public class Student {
	
	String name; //�л��̸�
	int ban; //��
	int no; //��ȣ
	int kor; //��������
	int eng; //��������
	int math; //��������
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() { //(�� * �ݿø��ڸ��� + 0.5) / �ݿø��ڸ���
		return (int)(getTotal() / 3f * 10 + 0.5f ) / 10f;
	}
	// 227/3f = 75.6666......
		// 75.66666... * 10 = 756.66666....
		// 756.6666..... + 0.5 = 757.16666....
		// (int)757.16666... =757
		// 757.1666... / 10f = 75.7
	
	
	void getAverage2() {
		System.out.println(String.format("%.1f", getTotal() / 3f));
	}//75.7
	
	float getAverage3() {
		return Math.round(((getTotal() / 3f)*10.0))/10.0f;
	}
	
	

}
