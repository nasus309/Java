import java.util.HashSet;
import java.util.Set;

public class HashSetExam2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿",30));
		set.add(new Member("ȫ�浿",30)); 
		// �ΰ��� �ٸ���ü�̴�(new�� ���༭) �ٵ� �̸��� ���̰� ���Ƽ� ���ü��....�ϳ��� ��ü�� �ν� 
		
		System.out.println("�� ��ü�� : " + set.size());
	}
}
