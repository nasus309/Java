import java.util.ArrayList;
import java.util.List;
//ArrayList -> Vector -> LinkedList -> HashSet -> HashMap -> Hashtable -> Properties 순서
public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); //capacity 는 10(기본)
		
		list.add("Java"); //0번 index
		list.add("JDBC"); //1번 index
		list.add("Servlet/JSP"); //2번 index
		list.add(2,"Database"); //2번 index/ 2번 index의 객체(Servlet...)는 3번으로감.
		list.add("iBATIS"); //4번 index
		
		int size = list.size();
		System.out.println("총 객체수: " +size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 :" + skill);
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		
	}
}
