package �÷���2;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam03 {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		//���ĺ��� ����~
		treeSet.add("apple");
		treeSet.add("forever"); //f�ڿ� o�ͼ� ���� xxx
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		//c~f���� �ܾ� �˻� (c,d,e,f)
		System.out.println("[c~f ������ �ܾ�˻�]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true); 
		//���� �˻� �� ��� (��������,���۰����Կ���(true������),����,�������Կ���)
		for(String word: rangeSet) {
			System.out.println(word);
		}
		
	}

}
