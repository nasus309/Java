import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	//iterator() 메소드는 index가 없는 Set컬렉션에서 저장된 객체를 한번씩 가져오는 반복자 리턴을 해줌.
	//set이 아마 순서(index)가 없는...list?
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java"); //뒤에 Java때문에 저장 안됨.
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //이것으로 대체가 되고 저장은 한 번만.
		set.add("iBATIS");
		
		//순서가 없는데 왜 저장은 순서대로 됨?
		
		int size = set.size();
		System.out.println("총 객체수 : " + size );
		
		Iterator<String> iterator  = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수 : " + set.size());
		
		for(String element:set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("비어있음.");
		}
	}

}
