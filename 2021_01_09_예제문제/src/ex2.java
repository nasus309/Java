
public class ex2 {

	public static void main(String[] args) {
		// 1 ~ 20 ������ �������� 2�� ����� 3�� ��� ������ ���� ���Ͻÿ�.
		
		int i;
		int hap=0;
		
		for(i=0;i<=20;i++) {
			if(i%2==0 || i%3==0) {
				hap = hap + i;
			}
		}
		System.out.println("���� "+hap);

	}

}
