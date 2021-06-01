package �÷���2;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam02 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(98);//����Ʈ�� ���� �����ʿ� ��ġ
		scores.add(75);//����Ʈ�� ������ʿ� ��ġ
		scores.add(95);
		scores.add(80);
		
		//scores.descendingIterator(); ������������ ���ĵ� �ݺ���
		//scores.descendingSet(); ������������ ���ĵ� set �÷���
		
		//��������
		NavigableSet<Integer> descendingSet = scores.descendingSet(); //������������ ���ĵ� ��ü���� ����
		for(Integer score : descendingSet) { 
			System.out.print(score + " "); //�������ں��� ���
		}
		System.out.println();
		
		//�������� �� �� -> ��������!!
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for(Integer score : ascendingSet) { 
			System.out.print(score + " "); //�������ں��� ���
		}
		System.out.println();
		
	}

}
