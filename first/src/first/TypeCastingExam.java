package first;

public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 50000;
		long y = x; // (������)����ȯ
		
		long x2 = 5;
//		int y2 = x2; x2�� int���� ū long Ÿ���̱� ������ ������ �߻�. ���� ����ȯ �ʿ�
		int y2 = (int)x2;

	}

}
