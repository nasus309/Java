import java.util.ArrayList;
import java.util.List;
//ArrayList -> Vector -> LinkedList -> HashSet -> HashMap -> Hashtable -> Properties ����
public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); //capacity �� 10(�⺻)
		
		list.add("Java"); //0�� index
		list.add("JDBC"); //1�� index
		list.add("Servlet/JSP"); //2�� index
		list.add(2,"Database"); //2�� index/ 2�� index�� ��ü(Servlet...)�� 3�����ΰ�.
		list.add("iBATIS"); //4�� index
		
		int size = list.size();
		System.out.println("�� ��ü��: " +size);
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
