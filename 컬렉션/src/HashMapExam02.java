import java.util.HashMap;
import java.util.Map;

public class HashMapExam02 {
	
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student,Integer>();
		
		map.put(new Student(1,"ȫ�浿"), 95); //���ü�� �ߺ��ؼ� Ű�� ����� �� ����~!
		map.put(new Student(1,"ȫ�浿"), 90); //������ �ٸ� ��ü���� Ű�� �����ϱ� ���� ��ü!
		
		System.out.println("�� Entry �� : " + map.size());
		System.out.println(map.get(new Student(1,"ȫ�浿"))); //key�� ���� value���
		
	}

}
