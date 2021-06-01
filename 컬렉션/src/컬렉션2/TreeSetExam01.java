package �÷���2;
import java.util.Iterator;
import java.util.TreeSet;

//����Ʈ���� ��������� Set�÷���, ���ʰ� ������ �ڽĳ�带 �����ϱ� ���� �ΰ��� ������ ����.
public class TreeSetExam01 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(98);//����Ʈ�� ���� �����ʿ� ��ġ
		scores.add(75);//����Ʈ�� ������ʿ� ��ġ
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("���� ���� ����: " + score);
		
		score = scores.last();
		System.out.println("���� ���� ����: " + score);
		
		score = scores.lower(new Integer(95)); //�����ڽĳ��, �� �� ��ü�� �ٷ� �Ʒ��� �ִ� ��ü
		System.out.println("95�� �Ʒ� ����: " + score);
		
		score = scores.higher(95); //�ٷ� ���� ��ü , ������ �ڽĳ��
		System.out.println("95�� ���� ����: " + score);
		
		score = scores.floor(new Integer(95)); //95�� ������ �� �Ʒ���.95�� �ִٸ� 95�� return
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: " + score);
		
		score = scores.ceiling(85);
		System.out.println("85�� �̰ų� �ٷ� ���� ����: " + score);
		
		//TreeSet�� ��ü�� �ϳ��� ������ pollFirst �� ������������ �������� pollLast�� ������������ ������
//		while(!scores.isEmpty()) {
//			score = scores.pollFirst(); //���� ���� �ڽĳ����� �ϳ��� ������ ������ ��.TreeSet���� ��ü�� ��������
//			System.out.println(score +"(���� ��ü�� : " + scores.size() + ")");
//		}
		
		//���Ͱ����ڵ�
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			int s = iterator.next();
			iterator.remove();//�̺κ��̾����� ���� ������
			System.out.print(s + "(���� ��ü�� : " + scores.size() + ")" + "\n");
		}
		
		
	}
}
