package �÷���2;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExam {
	//DescendingComparator�������̽� �ȸ�����ָ�
	//java.lang.ClassCastException ���� ���!!!!!!!!!!!
	public static void main(String[] args) {
		//������������ �����ϱ�~~~~~~~
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		
		treeSet.add(new Fruit("����",3000));
		treeSet.add(new Fruit("����",10000));
		treeSet.add(new Fruit("����",6000));
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name +":"+fruit.price);
			
		}

	}

}
