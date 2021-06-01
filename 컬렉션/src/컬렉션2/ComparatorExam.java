package 컬렉션2;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExam {
	//DescendingComparator인터페이스 안만들어주면
	//java.lang.ClassCastException 에러 뜬다!!!!!!!!!!!
	public static void main(String[] args) {
		//내림차순으로 정렬하기~~~~~~~
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		
		treeSet.add(new Fruit("포도",3000));
		treeSet.add(new Fruit("수박",10000));
		treeSet.add(new Fruit("딸기",6000));
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name +":"+fruit.price);
			
		}

	}

}
