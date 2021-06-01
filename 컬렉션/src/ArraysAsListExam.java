import java.util.Arrays;
import java.util.List;

public class ArraysAsListExam {
	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("ȫ�浿","�ſ��","���ڹ�");
		for(String name:list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3); //������ Arrays.asList(new Integer(1),new Integer(2),new Integer(3))
		for(int value:list2) { // ������ for(Integer value:list2)
			System.out.println(value);
		}
		
	}

}
