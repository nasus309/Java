package first;

public class EnumExam {
	
	//�������� �����ϱ������� final�� �̿�
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	public static void main(String[] args) {
		String gender1;
		// static�� �ʵ�� ��ü�� ��������(new) �ʰ� ��� ����!
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy";
		
		//gender1�� MALE�̳� FEMALE�� ���� �ϰ������...
		// => ������ ���
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		//gender2 = "boy"; => error ��!
	
	}
}

enum Gender{
	MALE, FEMALE;
}
