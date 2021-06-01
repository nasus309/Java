package 컬렉션2;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExam {

	public static void main(String[] args) {
		//Person Class에 Comparable 인터페이스를 구현해줬기 때문에 자동정렬!
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동",45));
		treeSet.add(new Person("김자바",25));
		treeSet.add(new Person("박지원",31));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}
	}

}
