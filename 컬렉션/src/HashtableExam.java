import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExam {
	//�����忡 ����ȭ�� �Ǿ� �ֱ� ������ �����忡 �����ϴ�!(��Ƽ �����忡 ����)
	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<String,String>();
		
		map.put("spring", "12");
		map.put("summer","123");
		map.put("fall", "1234");
		map.put("winter","12345");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵�: ");
			String id = s.nextLine();
			
			System.out.print("��й�ȣ: ");
			String password = s.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
				}else {
					System.out.println("���̵� �������� �ʽ��ϴ�.");
			}
			
			
		}

	}

}
